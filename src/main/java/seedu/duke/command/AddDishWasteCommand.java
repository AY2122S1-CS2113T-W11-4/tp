package seedu.duke.command;


import seedu.duke.Dish;
import seedu.duke.DishList;
import seedu.duke.Ui;
import seedu.duke.exceptions.FoodoramaException;
import seedu.duke.logger.LoggerManager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddDishWasteCommand extends Command {
    private static Logger logger = Logger.getLogger("AddDishWasteCommand.execute()");
    private static final Ui ui = new Ui();

    AddDishWasteCommand() {
        LoggerManager.setupLogger(logger);
    }

    @Override
    public void execute(ArrayList<String> parameters) throws FoodoramaException {
        logger.log(Level.INFO, "Start of process");
        String dish = String.join(" ", parameters);
        int dishIndex = DishList.find(dish);

        if (dishIndex == -1) {
            logger.log(Level.INFO, "Dish does not exist", dishIndex);
            throw new FoodoramaException(ui.getDishNotExistMsg(parameters.get(0)));
        } else {
            assert (dishIndex != -1) : "The dishIndex cannot be -1";
            try {
                Dish currentDish = DishList.dishList.get(dishIndex);
                currentDish.addWaste();
                logger.log(Level.INFO, "Successfully recorded Dish waste of "
                        + dish);
            } catch (FoodoramaException e) {
                throw new FoodoramaException(e.getMessage());
            }
        }
        logger.log(Level.INFO, "End of process");
    }

}

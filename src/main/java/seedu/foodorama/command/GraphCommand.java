package seedu.foodorama.command;

import seedu.foodorama.DishList;
import seedu.foodorama.IngredientList;
import seedu.foodorama.Ui;
import seedu.foodorama.exceptions.FoodoramaException;

import java.util.ArrayList;

public class GraphCommand extends Command {
    private static final Ui ui = new Ui();

    @Override
    public void execute(ArrayList<String> parameters) throws FoodoramaException {
        switch (parameters.get(0)) {
        case "dish":
            if (DishList.dishList.isEmpty()) {
                throw new FoodoramaException("List is empty, nothing to show");
            }
            DishList.graph();
            break;

        case "ingr":
            if (IngredientList.ingredientList.isEmpty()) {
                throw new FoodoramaException("List is empty, nothing to show");
            }
            IngredientList.graph();
            break;

        default:
            throw new FoodoramaException(ui.getGraphInvalidParamMsg());

        }
    }
}
package seedu.duke.command;

import org.junit.jupiter.api.Test;
import seedu.duke.DishList;
import seedu.duke.IngredientList;
import seedu.duke.exceptions.FoodoramaException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddDishCommandTest {

    @Test
    void execute_inputParameters_add() throws FoodoramaException {
        //Define inputs
        ArrayList<String> inputParams = new ArrayList<>();
        inputParams.add("chicken rice");


        Command testAddDishCommand = new AddDishCommand();
        testAddDishCommand.execute(inputParams);

        assertEquals("chicken rice", DishList.dishList.get(0).getDishName());
        DishList.dishList.clear();
        IngredientList.ingredientList.clear();
    }
}

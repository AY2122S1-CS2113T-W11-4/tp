package seedu.duke.command;

import org.junit.jupiter.api.Test;
import seedu.duke.DishList;
import seedu.duke.Ingredient;
import seedu.duke.IngredientList;
import seedu.duke.Ui;
import seedu.duke.exceptions.FoodoramaException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddDishIngrCommandTest {
    @Test
    void execute() {
        //Define inputs
        Ui ui = new Ui();
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("chicken rice");
        inputs.add("rice");
        AddDishIngrCommand commandToTest = new AddDishIngrCommand();
        //Add the dish and ingr to link
        DishList.add("chicken rice");
        IngredientList.ingredientList.add(new Ingredient("rice", 2.34));
        try {
            commandToTest.execute(inputs);
            assertEquals(1,DishList.dishList.get(0).getParts().size());
            //Clear lists
            DishList.clearList();
            IngredientList.clearList();
            //Test case if dish not present
            commandToTest.execute(inputs);
        } catch (FoodoramaException e) {
            assertEquals(ui.getDishNotExistMsg("chicken rice"), e.getMessage());
        }
    }
}
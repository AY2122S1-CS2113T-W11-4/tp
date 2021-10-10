package seedu.duke.command;

import org.junit.jupiter.api.Test;
import seedu.duke.DishList;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DeleteDishCommandTest {

    @Test
    void execute() {
        ArrayList<String> inputParams = new ArrayList<>();
        inputParams.add("chicken rice");

        Command testAddDishCommand = new AddDishCommand();
        testAddDishCommand.execute(inputParams);

        assertEquals(1, DishList.dishList.size());

        Command testDeleteDishCommand = new DeleteDishCommand();
        testDeleteDishCommand.execute(inputParams);
        assertEquals(0, DishList.dishList.size());
    }
}
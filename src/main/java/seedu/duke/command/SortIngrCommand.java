package seedu.duke.command;

import seedu.duke.Ingredient;
import seedu.duke.IngredientList;
import seedu.duke.Ui;

import java.util.ArrayList;
import java.util.Comparator;

public class SortIngrCommand extends Command {
    Comparator<Ingredient> ingrComparator;
    @Override
    public void execute(ArrayList<String> parameters) {
        IngredientList.ingredientList.sort(ingrComparator);
    }
}

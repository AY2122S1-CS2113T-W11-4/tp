package seedu.foodorama.command;

import seedu.foodorama.Dish;
import seedu.foodorama.DishList;
import seedu.foodorama.Ingredient;
import seedu.foodorama.IngredientList;
import seedu.foodorama.Ui;
import seedu.foodorama.exceptions.FoodoramaException;


import java.util.ArrayList;

public class FindCommand extends Command {
    private static final Ui ui = new Ui();

    @Override
    public void execute(ArrayList<String> parameters) throws FoodoramaException {
        String commandToExecute = parameters.get(0);
        parameters.remove(0);
        String itemToFind = String.join(" ", parameters);
        if (itemToFind.isBlank()) {
            throw new FoodoramaException(ui.getFindMissingParamMsg());
        } else {
            switch (commandToExecute) {
            case "dish":
                ArrayList<Dish> matchedDishList = new ArrayList<>();
                for (Dish matchingDishes : DishList.dishList) {
                    if (matchingDishes.getDishName().contains(itemToFind)) {
                        matchedDishList.add(matchingDishes);
                    }
                }
                ui.printMatchedDishes(matchedDishList);
                break;

            case "ingr":
                ArrayList<Ingredient> matchedIngrList = new ArrayList<>();
                for (Ingredient matchingIngr : IngredientList.ingredientList) {
                    if (matchingIngr.getIngredientName().contains(itemToFind)) {
                        matchedIngrList.add(matchingIngr);
                    }
                }
                ui.printMatchedIngredients(matchedIngrList);
                break;

            default:
                throw new FoodoramaException(ui.getFindInvalidParamMsg());
            }
        }
    }
}

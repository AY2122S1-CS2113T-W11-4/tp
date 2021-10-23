package seedu.duke;

import seedu.duke.exceptions.FoodoramaException;
import seedu.duke.logger.LoggerManager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dish implements Comparable<Dish> {
    private static final Logger logger = Logger.getLogger("Dish class");
    private ArrayList<Ingredient> parts = new ArrayList<>();
    private static final Ui ui = new Ui();
    private String dishName;
    private double wastage;
    //Each dish contributes a portion of its wastage to part ingredients
    private double ingredientContribution;

    public Dish(String dishName) {
        LoggerManager.setupLogger(logger);
        logger.log(Level.INFO, "Calling default constructor");
        this.dishName = dishName;
        this.wastage = 0.0;
        this.ingredientContribution = 0.0;
    }

    public Dish(String dishName, double wastage, double ingredientContribution) {
        LoggerManager.setupLogger(logger);
        logger.log(Level.INFO, "Calling loading constructor");
        this.dishName = dishName;
        this.wastage = wastage;
        this.ingredientContribution = ingredientContribution;
    }

    public String getDishName() {
        return dishName;
    }

    public double getWastage() {
        return wastage;
    }

    public double getIngredientContribution() {
        return ingredientContribution;
    }

    public ArrayList<Ingredient> getParts() {
        return parts;
    }

    public void addConstituent(String ingredientName) {
        int ingredientIndex = IngredientList.find(ingredientName);
        if (ingredientIndex == -1) {
            ui.printIngrNotExistMsg();
        } else {
            //Subtract the old contribution if it exists
            for (Ingredient ingredient : parts) {
                ingredient.addDishWaste(-ingredientContribution);
            }
            parts.add(IngredientList.ingredientList.get(ingredientIndex));

            ui.printAddedConstituentOf(ingredientName, dishName);

            //Modify the ingredient contribution to reflect the change
            ingredientContribution = wastage / parts.size();

            //Add new contribution
            for (Ingredient ingredient : parts) {
                ingredient.addDishWaste(ingredientContribution);
            }
        }
    }

    public void addWaste() throws FoodoramaException {
        ui.printEnterWeightOf(dishName);
        Scanner in = new Scanner(System.in);
        String dishWaste = in.nextLine();
        double inputWastage;
        try {
            inputWastage = Double.parseDouble(dishWaste);
        } catch (NumberFormatException e) {
            throw new FoodoramaException(ui.getInvalidNumberMsg());
        }
        assert inputWastage > 0 : "Adding negative waste is impossible";
        wastage += inputWastage;
        ui.printWastage(dishName, wastage);
        if (!parts.isEmpty()) {
            //Todo proportion stuff and prevent feedback loop
            ingredientContribution = wastage / parts.size();
            for (Ingredient ingredient : parts) {
                //Change in contribution is change in wastage / num of parts
                ingredient.addDishWaste(inputWastage / parts.size());
            }
        }
    }


    @Override
    public String toString() {
        String partList = "";
        if (!parts.isEmpty()) {
            for (Ingredient ingredient : parts) {
                partList = partList + "," + ingredient.getIngredientName();
            }
            partList = partList.replaceFirst(",", "");
        } else {
            logger.log(Level.INFO, "No parts present for dish " + dishName);
            partList = "None";
        }
        return dishName + System.lineSeparator()
                + "   Wastage: " + wastage + " kg" + System.lineSeparator()
                + "   Parts: " + partList;
    }

    public String toGraph(double max) {
        String bar = "[";
        int num = (int)(10 * wastage / max);
        for (int i = 0; i < 10; i++) {
            if (i < num) {
                bar = bar + "█";
            } else  {
                bar = bar + " ";
            }
        }
        bar = bar + "]";
        return dishName + System.lineSeparator()
                + "   Wastage: " + bar + " " + wastage + " kg";
    }

    public String formatData() {
        String output = "";
        output = output + dishName + "|" + wastage + "|" + ingredientContribution;
        for (Ingredient ingredient : parts) {
            output = output + "|" + ingredient.getIngredientName();
        }
        return output;
    }

    @Override
    public int compareTo(Dish o) {
        return (int) (o.wastage - wastage);
    }
}

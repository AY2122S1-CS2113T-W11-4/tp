package seedu.duke.storage;

import seedu.duke.Dish;
import seedu.duke.DishList;
import seedu.duke.Ingredient;
import seedu.duke.IngredientList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Storage {
    private static Logger logger = Logger.getLogger("Storage class");
    private static final String DIRECTORY_NAME = "data";
    private static final String FILE_NAME_DISH = "dishes.txt";
    private static final String FILE_NAME_INGR = "ingredients.txt";

    public static void write(String mode) {
        try {
            File newDirectory = new File(DIRECTORY_NAME);
            if (!newDirectory.exists()) {
                //System.out.println("Creating directory " + DIRECTORY_NAME);
                newDirectory.mkdirs();
            }
            switch (mode) {
            case "ingredient":
                FileWriter writer = new FileWriter(DIRECTORY_NAME + File.separator + FILE_NAME_INGR);
                for (Ingredient ingredient : IngredientList.ingredientList) {
                    writer.write(ingredient.formatData() + "\n");
                }
                writer.close();
                break;

            case "dish":
                writer = new FileWriter(DIRECTORY_NAME + File.separator + FILE_NAME_DISH);
                for (Dish dish : DishList.dishList) {
                    writer.write(dish.formatData() + "\n");
                }
                writer.close();
                break;

            default:
                assert false;
                break;
            }

        } catch (IOException e) {
            logger.log(Level.INFO, "File creation failed / unable to retrieve file");
            System.out.println("____________________________________________");
            System.out.println("Unable to access file");
            System.out.println("____________________________________________");
        }
    }

    public static void load() {
        loadIngredients();
        loadDishes();
    }


    private static void loadIngredients() {
        File newDirectory = new File(DIRECTORY_NAME);
        if (!newDirectory.exists()) {
            //System.out.println("Creating directory " + DIRECTORY_NAME);
            newDirectory.mkdirs();
        }
        File fileToReadIngr = new File(DIRECTORY_NAME + File.separator + FILE_NAME_INGR);
        try {
            Scanner s = new Scanner(fileToReadIngr);
            while (s.hasNext()) {
                String in = s.nextLine();
                String[] params = in.split("\\|");
                Ingredient ingredientToAdd = new Ingredient(params[0], Double.parseDouble(params[1]),
                        Double.parseDouble(params[2]));
                IngredientList.ingredientList.add(ingredientToAdd);
            }
        } catch (FileNotFoundException e) {
            try {
                //System.out.println("Creating " + FILE_NAME_INGR);
                fileToReadIngr.createNewFile();
            } catch (IOException ex) {
                logger.log(Level.INFO, "File creation failed / unable to retrieve file");
                System.out.println("____________________________________________");
                System.out.println("Unable to create ingredients.txt");
                System.out.println("____________________________________________");
            }
        }
    }

    private static void loadDishes() {
        File newDirectory = new File(DIRECTORY_NAME);
        if (!newDirectory.exists()) {
            //System.out.println("Creating directory " + DIRECTORY_NAME);
            newDirectory.mkdirs();
        }
        File fileToReadIngr = new File(DIRECTORY_NAME + File.separator + FILE_NAME_DISH);
        try {
            Scanner s = new Scanner(fileToReadIngr);
            while (s.hasNext()) {
                String in = s.nextLine();
                String[] params = in.split("\\|");
                Dish dishToAdd = new Dish(params[0], Double.parseDouble(params[1]), Double.parseDouble(params[2]));
                if (params.length > 3) {
                    //System.out.println("Contains constituents");
                    for (int i = 3; i < params.length; i++) {
                        int ingredientIndex = IngredientList.find(params[i]);
                        Ingredient dishComponent = IngredientList.ingredientList.get(ingredientIndex);
                        dishToAdd.getParts().add(dishComponent);
                        dishComponent.addDishWaste(dishToAdd.getIngredientContribution());
                    }
                }
                DishList.dishList.add(dishToAdd);
            }
        } catch (FileNotFoundException e) {
            try {
                //System.out.println("Creating " + FILE_NAME_DISH);
                fileToReadIngr.createNewFile();
            } catch (IOException ex) {
                logger.log(Level.INFO, "File creation failed / unable to retrieve file");
                System.out.println("____________________________________________");
                System.out.println("Unable to create dishes.txt");
                System.out.println("____________________________________________");
            }
        }
    }
}
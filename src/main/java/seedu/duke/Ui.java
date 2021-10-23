package seedu.duke;

import java.util.ArrayList;

public class Ui {
    private static final String LINE_DIVIDER = "____________________________________________________________";
    private static final String START_LOGO =
            "######################################################"
                    + "##########################################################" + System.lineSeparator()
                    + "#  ________  ______    ______   _______            ___"
                    + "___           _______    ______   __       __   ______   #" + System.lineSeparator()
                    + "# /        |/      \\  /      \\ /       \\          / "
                    + "     \\         /       \\  /      \\ /  \\     /  | /      \\  #" + System.lineSeparator()
                    + "# $$$$$$$$//$$$$$$  |/$$$$$$  |$$$$$$$  |        /$$$$$$  "
                    + "|        $$$$$$$  |/$$$$$$  |$$  \\   /$$ |/$$$$$$  | #" + System.lineSeparator()
                    + "# $$ |__   $$ |  $$ |$$ |  $$ |$$ |  $$ | ______ $$$  \\$"
                    + "$ | ______ $$ |__$$ |$$ |__$$ |$$$  \\ /$$$ |$$ |__$$ | #" + System.lineSeparator()
                    + "# $$    |  $$ |  $$ |$$ |  $$ |$$ |  $$ |/      |$$$$  $$"
                    + " |/      |$$    $$< $$    $$ |$$$$  /$$$$ |$$    $$ | #" + System.lineSeparator()
                    + "# $$$$$/   $$ |  $$ |$$ |  $$ |$$ |  $$ |$$$$$$/ $$ $$ $"
                    + "$ |$$$$$$/ $$$$$$$  |$$$$$$$$ |$$ $$ $$/$$ |$$$$$$$$ | #" + System.lineSeparator()
                    + "# $$ |     $$ \\__$$ |$$ \\__$$ |$$ |__$$ |        $$ \\"
                    + "$$$$ |        $$ |  $$ |$$ |  $$ |$$ |$$$/ $$ |$$ |  $$ | #" + System.lineSeparator()
                    + "# $$ |     $$    $$/ $$    $$/ $$    $$/         $$   $"
                    + "$$/         $$ |  $$ |$$ |  $$ |$$ | $/  $$ |$$ |  $$ | #" + System.lineSeparator()
                    + "# $$/       $$$$$$/   $$$$$$/  $$$$$$$/           $$$$"
                    + "$$/          $$/   $$/ $$/   $$/ $$/      $$/ $$/   $$/  #" + System.lineSeparator()
                    + "#######################################################"
                    + "#########################################################";

    private static final String EXIT_LOGO =
            "#######################################"
            + "####################################" + System.lineSeparator()
            + "#           _____                ____"
            + "_                    _____           #" + System.lineSeparator()
            + "#          /\\    \\              |\\"
            + "    \\                  /\\    \\          #" + System.lineSeparator()
            + "#         /::\\    \\             |:\\"
            + "____\\                /::\\    \\         #" + System.lineSeparator()
            + "#        /::::\\    \\            |::"
            + "|   |               /::::\\    \\        #" + System.lineSeparator()
            + "#       /::::::\\    \\           |::"
            + "|   |              /::::::\\    \\       #" + System.lineSeparator()
            + "#      /:::/\\:::\\    \\          |::"
            + "|   |             /:::/\\:::\\    \\      #" + System.lineSeparator()
            + "#     /:::/__\\:::\\    \\         |::"
            + "|   |            /:::/__\\:::\\    \\     #" + System.lineSeparator()
            + "#    /::::\\   \\:::\\    \\        |:"
            + ":|   |           /::::\\   \\:::\\    \\    #" + System.lineSeparator()
            + "#   /::::::\\   \\:::\\    \\       |:"
            + ":|___|______    /::::::\\   \\:::\\    \\   #" + System.lineSeparator()
            + "#  /:::/\\:::\\   \\:::\\ ___\\      /"
            + "::::::::\\    \\  /:::/\\:::\\   \\:::\\    \\  #" + System.lineSeparator()
            + "# /:::/__\\:::\\   \\:::|    |    /:::"
            + ":::::::\\____\\/:::/__\\:::\\   \\:::\\____\\ #" + System.lineSeparator()
            + "# \\:::\\   \\:::\\  /:::|____|   /:::"
            + "/~~~~/~~      \\:::\\   \\:::\\   \\::/    / #" + System.lineSeparator()
            + "#  \\:::\\   \\:::\\/:::/    /   /:::/"
            + "    /          \\:::\\   \\:::\\   \\/____/  #" + System.lineSeparator()
            + "#   \\:::\\   \\::::::/    /   /:::/  "
            + "  /            \\:::\\   \\:::\\    \\      #" + System.lineSeparator()
            + "#    \\:::\\   \\::::/    /   /:::/  "
            + "  /              \\:::\\   \\:::\\____\\     #" + System.lineSeparator()
            + "#     \\:::\\  /:::/    /    \\::/   "
            + " /                \\:::\\   \\::/    /     #" + System.lineSeparator()
            + "#      \\:::\\/:::/    /      \\/____"
            + "/                  \\:::\\   \\/____/      #" + System.lineSeparator()
            + "#       \\::::::/    /              "
            + "                   \\:::\\    \\          #" + System.lineSeparator()
            + "#        \\::::/    /              "
            + "                     \\:::\\____\\         #" + System.lineSeparator()
            + "#         \\::/____/                "
            + "                     \\::/    /         #" + System.lineSeparator()
            + "#          ~~                       "
            + "                     \\/____/          #" + System.lineSeparator()
            + "####################################"
            + "#######################################";

    private static final String WELCOME_MESSSAGE = START_LOGO + System.lineSeparator()
            + "#             Hello, welcome to FOOD-O-RAMA! "
            + "The number one solution for food waste management.                #" + System.lineSeparator()
            + "#                  Type a command to get us sta"
            + "rted, or type help for a list of commands!                      #" + System.lineSeparator()
            + "###########################################"
            + "#####################################################################";

    private static final String NEWPAGE_MESSSAGE = START_LOGO + System.lineSeparator()
            + "#                                            SUMMARY OF COMMANDS:                                  "
            + "            #" + System.lineSeparator()
            + "# 1. Adding a Dish : 'add dish [dishName]'                                                         "
            + "            #" + System.lineSeparator()
            + "# 2. Adding Dish Wastage : 'add dish waste [dishName]' followed by '[weight in KG]'                "
            + "            #" + System.lineSeparator()
            + "# 3. Deleting a Dish : 'del dish [dishName]                                                        "
            + "            #" + System.lineSeparator()
            + "# 4. Adding a new Ingredient : 'add ingr [ingrName]' followed by '[weight in KG]'                  "
            + "            #" + System.lineSeparator()
            + "# 5. Adding storage to an already existing Ingredient : 'add ingr stored [ingrName]'               "
            + "            #" + System.lineSeparator()
            + "#    followed by '[weight in KG]'                                                                  "
            + "            #" + System.lineSeparator()
            + "# 6. Adding Ingredient Wastage : 'add ingr waste [ingrName]' followed by '[weight in KG]'          "
            + "            #" + System.lineSeparator()
            + "# 7. Linking an Ingredient to a Dish : 'add constituent [dishName] / [ingrName]'                   "
            + "            #" + System.lineSeparator()
            + "# 8. Deleting an Ingredient : 'del ingr [ingrName]'                                                "
            + "            #" + System.lineSeparator()
            + "# 9. Find a Dish/Ingredient : 'find dish [KEYWORD] | find ingr [KEYWORD]'                          "
            + "            #" + System.lineSeparator()
            + "# 10. Viewing all Dishes/Ingredients : 'list dish | list ingr'                                     "
            + "            #" + System.lineSeparator()
            + "# 11. View graph of all Dishes/Ingredients : 'graph dish | graph ingr'                             "
            + "            #" + System.lineSeparator()
            + "# 11. Sort list of Dishes/Ingredients : 'sort dish | sort ingr'                                    "
            + "            #" + System.lineSeparator()
            + "# 12. Clearing saved lists: 'clear dish' | 'clear ingr' | 'clear all'                              "
            + "            #" + System.lineSeparator()
            + "# 13. View full list of commands and examples: 'help'                                              "
            + "            #" + System.lineSeparator()
            + "# 14. Exiting the program: 'bye'                                                                   "
            + "            #" + System.lineSeparator()
            + "###################################################################################################"
            + "#############" + System.lineSeparator()
            + "#                              For a full, detailed list of commands, type 'help'                  "
            + "            #" + System.lineSeparator()
            + "###################################################################################################"
            + "#############";

    protected static final String HELP_ME = LINE_DIVIDER + System.lineSeparator()
            + "Here are the commands you can use:" + System.lineSeparator()
            + "1. Adding a Dish : 'add dish [dishName]'" + System.lineSeparator()
            + "    Example: 'add dish chicken rice'" + System.lineSeparator()
            + "2. Adding Dish Wastage : 'add dish waste [dishName]' followed by "
            + "'[weight in KG]'" + System.lineSeparator()
            + "    Example: 'add dish waste chicken rice' ; '0.8'" + System.lineSeparator()
            + "3. Finding a Dish : 'find dish [keyword]'" + System.lineSeparator()
            + "    Example: 'find dish chicken rice'" + System.lineSeparator()
            + "4. Deleting a Dish : 'del [dishName]" + System.lineSeparator()
            + "    Example: 'del dish chicken rice'" + System.lineSeparator()
            + "5. Viewing all Dishes : 'list dish'" + System.lineSeparator()
            + "6. Sorting Dishes according to Dish Wastage : 'sort dish'" + System.lineSeparator()
            + "7. Viewing Graph of Dish Wastage : 'graph dish'" + System.lineSeparator()
            + "8. Clearing all Dishes : 'clear dish'" + System.lineSeparator()
            + "9. Adding a new Ingredient : 'add ingr [ingrName]' followed by '[weight in KG]'" + System.lineSeparator()
            + "    Example: 'add ingr chicken' ; '2'" + System.lineSeparator()
            + "10. Adding storage to an already existing Ingredient : 'add ingr stored [ingrName]'"
            + " followed by '[weight in KG]'" + System.lineSeparator()
            + "    Example: 'add ingr stored chicken' ; '1.5'" + System.lineSeparator()
            + "11. Adding Ingredient Wastage : 'add ingr waste [ingrName]' followed by "
            + "'[weight in KG]'" + System.lineSeparator()
            + "    Example: 'add ingr waste chicken' ; '0.7'" + System.lineSeparator()
            + "12. Linking an Ingredient to a Dish : 'add constituent [dishName] / [ingrName]'" + System.lineSeparator()
            + "    Example: 'add constituent chicken rice / chicken'" + System.lineSeparator()
            + "13. Finding an Ingredient : 'find ingr [keyword]'" + System.lineSeparator()
            + "    Example: 'find ingr chicken'" + System.lineSeparator()
            + "14. Deleting an Ingredient : 'del [ingrName]'" + System.lineSeparator()
            + "    Example: 'del ingr chicken'" + System.lineSeparator()
            + "15. Viewing all Ingredients : 'list ingr'" + System.lineSeparator()
            + "16. Sorting Ingredients according to Ingredient Wastage : 'sort ingr'" + System.lineSeparator()
            + "17. Viewing Graph of Ingredient Wastage : 'graph ingr'" + System.lineSeparator()
            + "18. Clearing all Ingredients : 'clear ingr'" + System.lineSeparator()
            + "19. Clearing both Dishes and Ingredients : 'clear all'" + System.lineSeparator()
            + "20. Viewing this list of commands: help" + System.lineSeparator()
            + "21. Exiting the program: bye" + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String EXIT_MESSAGE = EXIT_LOGO + System.lineSeparator()
            + "#       Thank you for using Food-O-Rama to track your food wastage.       #" + System.lineSeparator()
            + "#                Your data has been saved successfully.                   #" + System.lineSeparator()
            + "#                         Have a nice day!                                #" + System.lineSeparator()
            + "#                   Love, the Food-O-Rama Team <3                         #" + System.lineSeparator()
            + "###########################################################################";

    private static final String INVALID_COMMAND = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, that is an invalid command." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String INVALID_PARAMETERS = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, please input a valid parameter." + System.lineSeparator()
            + LINE_DIVIDER;

    public static final String INVALID_NUMBER = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, please input a valid number" + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String LIST_MISSING_PARAM = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, please input: list [TYPE]." + System.lineSeparator()
            + "[TYPE]: dish to list dishes, ingr to list ingredients." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String DISH_EXISTS = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, this dish already exists in your list." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String DISH_NOTEXIST = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, this dish does not exist in your list." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String DISHNAME_MISSING = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, the dish name cannot be blank." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String DISH_SORT = LINE_DIVIDER + System.lineSeparator()
            + "List of Dishes has been sorted." + System.lineSeparator();

    private static final String DISH_LIST_CLEARED = LINE_DIVIDER + System.lineSeparator()
            + "Dish list has been cleared." + System.lineSeparator();

    private static final String INGRNAME_MISSING = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, the ingredient name cannot be blank." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String INGR_NOTEXIST = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, this ingredient does not exist in your list." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String INGR_EXISTS = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, this ingredient already exists in your list." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String INGR_SORT = LINE_DIVIDER + System.lineSeparator()
            + "List of Ingredients has been sorted." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String INGR_LIST_CLEARED = LINE_DIVIDER + System.lineSeparator()
            + "Ingredient list has been cleared." + System.lineSeparator()
            + LINE_DIVIDER;

    private static final String ALL_CLEARED = LINE_DIVIDER + System.lineSeparator()
            + "Both Dish and Ingredient lists have been cleared." + System.lineSeparator()
            + LINE_DIVIDER;

    public static final String FIND_MISSING_PARAM = LINE_DIVIDER + System.lineSeparator()
            + "Please enter a keyword!" + System.lineSeparator()
            + LINE_DIVIDER;

    public static final String FIND_INVALID_PARAM = LINE_DIVIDER + System.lineSeparator()
            + "Incorrect paramater! Please type find <dish/ingredient>" + System.lineSeparator()
            + LINE_DIVIDER;

    public static final String GRAPH_INVALID_PARAM = LINE_DIVIDER + System.lineSeparator()
            + "Sorry, please input: graph [TYPE]." + System.lineSeparator()
            + "[TYPE]: dish to list dishes, ingr to list ingredients." + System.lineSeparator()
            + LINE_DIVIDER;

    public void printLogo() {
        System.out.println(START_LOGO);
    }

    public void printWelcomeMsg() {
        System.out.println(WELCOME_MESSSAGE);
    }

    public void printExitMsg() {
        System.out.println(EXIT_MESSAGE);
    }

    public String getLineDivider() {
        return LINE_DIVIDER;
    }

    public String getInvalidCommandMsg() {
        return INVALID_COMMAND;
    }

    public String getInvalidNumberMsg() {
        return INVALID_NUMBER;
    }

    public String getListMissingParamMsg() {
        return LIST_MISSING_PARAM;
    }

    public String getDishNameMissingMsg() {
        return DISHNAME_MISSING;
    }

    public String getDishNotExistMsg(String dishName) {
        assert dishName != null : "dishName cannot be null";
        return LINE_DIVIDER + System.lineSeparator()
                + "Sorry, the dish " + dishName + " does not exist in your list." + System.lineSeparator()
                + LINE_DIVIDER;
    }

    public void printDishNotExistMsg() {
        System.out.println(DISH_NOTEXIST);
    }

    public void printDishExistsMsg() {
        System.out.println(DISH_EXISTS);
    }

    public void printAddedDish(String dishName) {
        assert dishName != null : "dishName cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Dish added to list: " + dishName + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printDishNameRemoved(String dishName) {
        assert dishName != null : "dishName cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + dishName + " has been removed!" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printDishList(ArrayList<Dish> dishList) {
        assert dishList != null : "dishList cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Here are the dishes you have:");
        for (int i = 0; i < dishList.size(); i++) {
            System.out.println((i + 1) + ". " + dishList.get(i));
        }
        System.out.println("You can use command 'add' to add new dishes!" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printAddedIngredient(Ingredient ingredientToAdd, double ingredientWeight) {
        assert ingredientToAdd != null : "ingredientList cannot be null";
        assert ingredientWeight != -1 : "ingredientWeight cannot be negative";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Ingredient added to list: " + ingredientToAdd.getIngredientName()
                + " (Weight: " + ingredientWeight + " kg)" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printIngrList(ArrayList<Ingredient> ingredientList) {
        assert ingredientList != null : "ingredientList cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Here are the ingredients you have: ");
        for (int i = 0; i < ingredientList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientList.get(i));
        }
        System.out.println("You can use command 'add' to add new ingredients!" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printIngrNameRemoved(String ingredientName) {
        assert ingredientName != null : "ingredientName cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + ingredientName + " has been removed!" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public String getIngrNameMissingMsg() {
        return INGRNAME_MISSING;
    }

    public String getIngrNotExistMsg() {
        return INGR_NOTEXIST;
    }

    public void printIngrNotExistMsg() {
        System.out.println(INGR_NOTEXIST);
    }

    public String getIngrExistsMsg(String ingrName) {
        assert ingrName != null : "ingrName cannot be null";
        return LINE_DIVIDER + System.lineSeparator()
                + "Sorry, the ingredient" + ingrName + "already exists in your list." + System.lineSeparator()
                + LINE_DIVIDER;
    }

    public void printInvalidParamMsg() {
        System.out.println(INVALID_PARAMETERS);
    }

    public static String getHelpMsg() {
        return HELP_ME;
    }

    public void printHelpMsg() {
        System.out.println(HELP_ME);
    }

    public void printDishListCleared() {
        System.out.println(DISH_LIST_CLEARED);
    }

    public void printIngrListCleared() {
        System.out.println(INGR_LIST_CLEARED);
    }

    public void printAllCleared() {
        System.out.println(ALL_CLEARED);
    }

    public void printSortIngrMsg() {
        System.out.println(INGR_SORT);
    }

    public void printSortDishMsg() {
        System.out.println(DISH_SORT);
    }

    public void printDishListGraph(ArrayList<Dish> dishList) {
        assert dishList != null : "dishList cannot be null";
        double max = DishList.getGreatestWaste();
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Here are the dishes you have:");
        for (int i = 0; i < dishList.size(); i++) {
            System.out.println((i + 1) + ". " + dishList.get(i).toGraph(max));
        }
        System.out.println("You can use command 'add' to add new dishes!" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printIngrListGraph(ArrayList<Ingredient> ingredientList) {
        assert ingredientList != null : "ingredientList cannot be null";
        double max = IngredientList.getGreatestWaste();
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Here are the dishes you have: ");
        for (int i = 0; i < ingredientList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientList.get(i).toGraph(max));
        }
        System.out.println("You can use command 'add' to add new dishes!" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printMatchedDishes(ArrayList<Dish> matchedDishList) {
        assert matchedDishList != null : "matchedDishList cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "As requested, here are the matching dishes in your list:");
        if (DishList.dishList.size() == 0) {
            System.out.println("There are no dishes recorded!");
        } else if (matchedDishList.size() == 0) {
            System.out.println("The keyword cannot be found!");
        } else {
            int taskCounter = 0;
            for (Dish element : matchedDishList) {
                System.out.println(taskCounter + 1 + ". " + element.toString());
                taskCounter++;
            }
        }
        System.out.println(LINE_DIVIDER);
    }

    public void printMatchedIngredients(ArrayList<Ingredient> matchedIngrList) {
        assert matchedIngrList != null : "matchedIngrList cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "As requested, here are the matching ingredients in your list:");
        if (IngredientList.ingredientList.size() == 0) {
            System.out.println("There are no ingredients recorded!");
        } else if (matchedIngrList.size() == 0) {
            System.out.println("The keyword cannot be found!");
        } else {
            int taskCounter = 0;
            for (Ingredient element : matchedIngrList) {
                System.out.println(taskCounter + 1 + ". " + element.toString());
                taskCounter++;
            }
        }
        System.out.println(LINE_DIVIDER);
    }

    public void printAddedConstituentOf(String ingredientName, String dishName) {
        assert ingredientName != null : "ingredientName cannot be null";
        assert dishName != null : "dishName cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Successfully added " + ingredientName + " as ingredient of " + dishName + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printEnterWeightOf(String name) {
        assert name != null : "name cannot be null";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + "Enter the weight of " + name + " in kg:" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public String getFindMissingParamMsg() {
        return FIND_MISSING_PARAM;
    }

    public String getFindInvalidParamMsg() {
        return FIND_INVALID_PARAM;
    }

    public String getGraphInvalidParamMsg() {
        return GRAPH_INVALID_PARAM;
    }

    public void printWastage(String name, double wastage) {
        assert name != null : "name cannot be null";
        assert wastage != -1 : "wastage cannot be negative";
        System.out.println(LINE_DIVIDER + System.lineSeparator()
                + name + " is now " + wastage + " kg" + System.lineSeparator()
                + LINE_DIVIDER);
    }

    public void printStorage(String name, double storage) {
        assert name != null : "name cannot be null";
        assert storage != -1 : "storage cannot be negative";
        System.out.println("Storage of " + name + " is now " + storage + " kg");
    }

    public void clearTerminalAndPrintNewPage() {
        ClearScreen.clearConsole();
        System.out.println(NEWPAGE_MESSSAGE);
    }
}

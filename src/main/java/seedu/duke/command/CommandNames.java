package seedu.duke.command;

public enum CommandNames {
    ADD_DISH_WASTE("add dish waste", new AddDishWasteCommand()),
    ADD_INGR_WASTE("add ingr waste", new AddIngrWasteCommand()),
    ADD_INGR_STORED("add ingr stored", new AddIngrStoredCommand()),
    LINK("link", new AddDishIngrCommand()),
    ADD_DISH("add dish", new AddDishCommand()),
    ADD_INGR("add ingr", new AddIngrCommand()),
    DELETE_DISH("del dish", new DeleteDishCommand()),
    DELETE_INGR("del ingr", new DeleteIngrCommand()),
    LIST("list", new ListCommand()),
    FIND("find", new FindCommand()),
    GRAPH("graph", new GraphCommand()),
    CLEAR_DISH("clear dish", new ClearDishCommand()),
    CLEAR_INGR("clear ingr", new ClearIngrCommand()),
    CLEAR_ALL("clear all", new ClearAllCommand()),
    HELP("help", new HelpCommand()),
    SORT_DISH("sort dish", new SortDishCommand()),
    SORT_INGR("sort ingr", new SortIngrCommand());


    private String name;
    private Command callbackCommand;
    CommandNames(String name, Command callbackCommand) {
        this.name = name;
        this.callbackCommand = callbackCommand;
    }

    public String getName() {
        return name;
    }

    public Command getCallbackCommand() {
        return callbackCommand;
    }
}

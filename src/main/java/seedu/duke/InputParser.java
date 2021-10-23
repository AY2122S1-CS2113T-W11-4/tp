package seedu.duke;

import seedu.duke.command.CommandNames;
import seedu.duke.exceptions.FoodoramaException;
import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public Ui ui = new Ui();

    public CommandNames getCommandName(String input) throws FoodoramaException {
        for (CommandNames command : CommandNames.values()) {
            if (input.startsWith(command.getName())) {
                return command;
            }
        }
        throw new FoodoramaException(ui.getInvalidCommandMsg());
    }

    public ArrayList<String> getParameters(String input, CommandNames inputCommand) throws FoodoramaException {
        Ui ui  = new Ui();
        ArrayList<String> parameters = new ArrayList<>();

        //Replace the first command part with null, and you'll be left with params
        String parameterString = input.replaceFirst(inputCommand.getName(), "").trim();
        switch (inputCommand) {

        //No parameter commands
        case CLEAR_DISH:
        case CLEAR_INGR:
        case CLEAR_ALL:
        case SORT_DISH:
        case SORT_INGR:
        case HELP:
            if (!parameterString.isBlank()) {
                ui.printInvalidParamMsg();
            }
            break;

        //One parameter commands just add the parameterString
        case GRAPH:
        case ADD_DISH_WASTE:
        case ADD_INGR_WASTE:
        case ADD_INGR_STORED:
        case DELETE_DISH:
        case DELETE_INGR:
        case ADD_INGR:
        case ADD_DISH:
        case LIST:
            parameters.add(parameterString);
            break;

        //Multi param is same as one but will need to split further
        case LINK:
            //TODO trim inputs
            String[] splitString = parameterString.split("/", 2);
            for (String param : splitString) {
                parameters.add(param.trim());
            }
            break;

        case FIND:
            String[] splitBySpace = parameterString.split(" ", 2);
            parameters.addAll(List.of(splitBySpace));
            break;

        default:
            break;
        }

        return parameters;
    }

}

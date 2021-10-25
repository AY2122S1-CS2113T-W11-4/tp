package seedu.foodorama.command;

import seedu.foodorama.Ui;

import java.util.ArrayList;

public class HelpCommand extends Command {
    private static final Ui ui = new Ui();

    @Override
    public void execute(ArrayList<String> parameters) {
        ui.printHelpMsg();
    }
}

package mauridjango.ui;

import java.util.ArrayList;

/**
 * Abstract class representing Input/Output operations for the application.
 * Subclasses must implement the `write` and `read` methods to handle IO operations.
 */
public abstract class IO {

    /**
     * Write a message to the output.
     *
     * @param message The message to be displayed.
     */
    public abstract void write(String message);

    /**
     * Read user input.
     *
     * @return The user's input as a String.
     */
    public abstract String read();

    /**
     * Get a list of user inputs based on a list of questions.
     *
     * @param questions A list of questions to display to the user.
     * @return A list of user inputs corresponding to the questions.
     */
    public ArrayList<String> getInputs(ArrayList<String> questions) {
        ArrayList<String> inputs = new ArrayList<>();
        questions.forEach(question -> {
            write(question);
            inputs.add(read());
        });
        return inputs;
    }

    public printTable(ArrayList<String> table) {
        System.out.(table);
    }
}

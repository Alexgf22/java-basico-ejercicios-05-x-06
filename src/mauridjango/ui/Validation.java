package mauridjango.ui;

/**
 * Utility class for input validation.
 */
public class Validation {

    /**
     * Parse an integer from a string input, and keep prompting the user until a valid integer is provided.
     *
     * @param string The string input to be parsed as an integer.
     * @return The parsed integer value.
     * @throws NumberFormatException if the input is not a valid integer.
     */
    public static int getInt(String string) throws NumberFormatException {
        Integer input = null;
        while (input == null) {
            try {
                input = Integer.parseInt(string);  // Parse user input as an integer
            } catch (NumberFormatException e) {
                System.out.println("The number you entered was incorrect");
            }
        }
        return input;
    }
}

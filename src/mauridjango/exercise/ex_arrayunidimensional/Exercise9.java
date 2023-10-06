package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise9 extends Exercise {

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise9(IO io) {
        super(io);
        String exerciseName = "Exercise 9";
        String description = """
                Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la
                palabra “par” o “impar” según proceda.
                """;
        question.add("Enter a number");
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            ArrayList<String> inputs = getInputs();
            int number = io.toInt(inputs.get(0));
            io.write(String.format("Number: %d is %s", number, evenOdd(number)));
        }
    }

    private String evenOdd(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "Par";
        } else {
            result = "Impar";
        }
        return result;
    }
}

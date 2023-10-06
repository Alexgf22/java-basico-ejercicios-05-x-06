package mauridjango.exercise.ex_funciones;

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
                digitoN: Devuelve el dígito que está en la posición n de un número
                """;
        question.add("Enter a number");
        question.add("Enter a position");
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        int position = io.toInt(inputs.get(1));
        io.write(String.format("The digit is %d", getInt(number, position)));
    }

    private int getInt(int number, int position) {
        return Integer.parseInt(String.valueOf(Integer.toString(number).charAt(position)));
    }
}

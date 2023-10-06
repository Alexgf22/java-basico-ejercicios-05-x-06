package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise13 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise13(IO io) {
        super(io);
        String exerciseName = "Exercise 13";
        String description = """
                trozoDeNumero: Toma como parámetros las posiciones inicial y final
                dentro de un número y devuelve el trozo correspondiente.
                """;
        question.add("Enter a number");
        question.add("Enter the starting position");
        question.add("Enter the final position");
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        int initialPosition = io.toInt(inputs.get(1));
        int finalPosition = io.toInt(inputs.get(2));
        io.write(String.format("The number is %s", subString(initialPosition, finalPosition, number)));
    }

    private String subString(int initialPosition, int finalPosition, int number) {
        return Integer.toString(number).substring(initialPosition, finalPosition);
    }
}

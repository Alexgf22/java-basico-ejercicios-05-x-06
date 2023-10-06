package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise11 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise11(IO io) {
        super(io);
        String exerciseName = "Exercise 11";
        String description = """
                quitaPorDetras: Le quita a un número n dígitos por detrás (por la
                derecha).
                """;
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        io.write(String.format("The number of digits is %d", quitaPorDetras(number)));
    }

    private int quitaPorDetras(int number) {
        return number % 10;
    }
}

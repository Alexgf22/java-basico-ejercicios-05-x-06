package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise7 extends Exercise {

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise7(IO io) {
        super(io);
        String exerciseName = "Exercise 7";
        String description = "Digitos: Cuenta el número de dígitos de un número entero";
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        io.write(String.format("The number of digits is %d", countDigits(number)));
    }

    private int countDigits(int number) {
        return Integer.toString(number).length();
    }
}

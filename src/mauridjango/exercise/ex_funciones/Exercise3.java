package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise3 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise3(IO io) {
        super(io);
        String exerciseName = "Exercise 3";
        String description = """
                siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
                """;
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        io.write(String.format("The next closest prime number is %d", getNextPrime(number)));
    }

    private int getNextPrime(int number) {
        int result = number + 1;
        boolean found = false;
        while (!found) {
            boolean isPrime = true;
            for (int i = 2; i < result; i++) {
                if (i % number == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
               found = true;
            } else {
                result++;
            }
        }
        return result;
    }
}

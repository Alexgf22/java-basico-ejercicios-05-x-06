package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise15 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise15(IO io) {
        super(io);
        String exerciseName = "Exercise 15";
        String description = "Muestra los números primos que hay entre 1 y 1000";
    }

    @Override
    public void run() {
        ArrayList<Integer> arrays = getPrime(1, 1000);
        arrays.forEach((number) -> {
            io.write(String.format("%d is prime", number));
        });
    }

    private ArrayList<Integer> getPrime(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int  i = start; i <=  end; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i) {
                    primes.add(i);
                }
            }
        }
        return primes;
    }
}

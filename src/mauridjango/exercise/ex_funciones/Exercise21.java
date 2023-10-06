package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise21 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise21(IO io) {
        super(io);
        String exerciseName = "Exercise 21";
        String description = "minimoArrayInt: Devuelve el mínimo del array que se pasa como";
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<String> inputs = getInputs();
            array.add(io.toInt(inputs.get(0)));
        }
        io.write(String.format("The minimum of the array is %d", getMin(array)));
    }

    private int getMin(ArrayList<Integer> array) {
        AtomicInteger min = new AtomicInteger(array.get(0));
        array.forEach((number) -> {
            if (number < min.get()) {
                min.set(number);
            }
        });
        return min.get();
    }
}

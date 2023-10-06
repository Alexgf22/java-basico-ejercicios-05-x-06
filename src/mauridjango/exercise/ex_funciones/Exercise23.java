package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise23 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise23(IO io) {
        super(io);
        String exerciseName = "Exercise 23";
        String description = "mediaArrayInt: Devuelve la media del array que se pasa como pará-\n" +
                "metro.";
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<String> inputs = getInputs();
            array.add(io.toInt(inputs.get(0)));
        }
        io.write(String.format("The average of the array is %d", getAvg(array)));
    }

    private int getAvg(ArrayList<Integer> array) {
        AtomicInteger sum = new AtomicInteger();
        array.forEach(sum::addAndGet);
        return sum.get() / array.size();
    }
}
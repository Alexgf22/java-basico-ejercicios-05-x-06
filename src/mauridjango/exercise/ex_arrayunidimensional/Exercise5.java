package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;
import mauridjango.ui.Validation;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 extends Exercise {
    String exerciseName = "Exercise 5";
    String description = """
            Escribe un programa que pida 10 números por teclado y que luego muestre los números intro-
            ducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respecti-
            vamente.""";

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise5(IO io) {
        super(io);
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(io.toInt(getInputs().get(0)));
        }

        io.write(markMaxMin(arrayList));
    }

    private String markMaxMin(ArrayList<Integer> arrayList) {
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        StringBuilder output = new StringBuilder();

        for (Integer i : arrayList) {
            if (i == max) {
                output.append(i).append(" Maximum, ");
            } else if (i == min) {
                output.append(i).append(" Minimum, ");
            } else {
                output.append(i).append(", ");
            }
        }
        return output.toString();
    }
}

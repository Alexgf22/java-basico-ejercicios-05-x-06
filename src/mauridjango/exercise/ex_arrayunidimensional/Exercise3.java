package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;
import mauridjango.ui.Validation;

import java.util.ArrayList;
import java.util.Queue;

public class Exercise3 extends Exercise {
    String exerciseName = "Exercise 3";
    String description = """
            Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
            decir, el primero que se introduce es el último en mostrarse y viceversa
            """;

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise3(IO io) {
        super(io);
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = Validation.getInt(getInputs().get(0));
            arrayList = queue(number, arrayList);
        }
    }

    private ArrayList<Integer> queue(int number, ArrayList<Integer> arrayList) {
        arrayList.add(number);
        return arrayList;
    }
}

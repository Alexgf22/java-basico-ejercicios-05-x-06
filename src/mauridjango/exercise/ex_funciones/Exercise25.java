package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise25 extends Exercise {
    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise25(IO io) {
        super(io);
        String exerciseName = "Exercise 25";
        String description = "posicionEnArray: Busca un número en un array y devuelve la posición\n" +
                "(el índice) en la que se encuentra.";
        question.add("Enter a index");
    }

    @Override
    public void run() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add((int) Math.round(Math.random() * 10));
        }
        io.write(String.format("The position of %d is %d", io.toInt(getInputs().get(0)), findPosition(array, io.toInt(question.get(0)))));
    }

    public int findPosition(ArrayList<Integer> array, int number) {
        return array.get(number);
    }
}

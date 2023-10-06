package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

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
                Escribe un programa que rellene un array de 100 elementos con números ente- ros aleatorios com-
                prendidos entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y pre-
                guntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar
                el array escribiendo el número destacado entre dobles asteriscos. Ejemplo:
                """;
    }

    @Override
    public void run() throws InvalidInputException {
        ArrayList<Integer> array = getArray();
        io.write(array.toString());
        io.write("Would you like to the the maximum and minimum values?");
        if (io.getYN()) {
            io.write(getMaxMin(array) + array);
        }
    }

    private ArrayList<Integer> getArray() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array.add((int) Math.round(Math.random() * 500));
        }
        return array;
    }

    private String getMaxMin(ArrayList<Integer> array) {
        AtomicReference<Integer> min = new AtomicReference<>(array.get(0));
        AtomicReference<Integer> max = new AtomicReference<>(array.get(0));
        array.forEach((number) -> {
            if (number > max.get()) {
                max.set(number);
            }
            if (number < min.get()) {
                min.set(number);
            }
        });
        return String.format("Max: %d, Min: %d", max.get(), min.get());
    }
}

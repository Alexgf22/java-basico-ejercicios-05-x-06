package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;
import java.util.Arrays;
import java.util.List;

public class Exercise1 extends Exercise {
    String exerciseName = "Exercise 1";
    String description = """
            Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se
            muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con
            los valores de los elementos que no han sido inicializados?
            """;

    List<Integer> num = Arrays.asList(39, -2, 0, 0, 0, 0, 14, 0, 5, 120, 0, 0);

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise1(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.write(uniListToTable(num));
    }

    private String uniListToTable(List<Integer> list) {
        StringBuilder table = new StringBuilder();
        list.forEach(item -> table.append(item).append(" | "));
        return table.toString();
    }
}



package mauridjango.exercise.ex_arrayunidimensional;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.Arrays;
import java.util.List;

public class Exercise2 extends Exercise {
    String exerciseName = "Exercise 2";
    String decscription = """
            Define un array de 10 caracteres con nombre símbolo y asigna valores a los elementos según la
            tabla que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
            sucede con los valores de los elementos que no han sido inicializados?
            """;

    List<String> simbolo = Arrays.asList("a", "x", "", "", "@", "", " ", "+", "Q", "");

    /**
     * Constructor to initialize the Exercise with an IO object.
     *
     * @param io An IO object for input and output.
     */
    public Exercise2(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.write(uniListToTable(simbolo));
    }

    private String uniListToTable(List<String> list) {
        StringBuilder table = new StringBuilder();
        list.forEach(item -> table.append(item).append(" | "));
        return table.toString();
    }
}

package mauridjango.exercise.ex_arraysbidemensionales;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.Arrays;
import java.util.List;

public class Exercise1 extends Exercise {

    List<String> row1 = Arrays.asList( "0", "30","2", "", "", "5");
    List<String> row2 = Arrays.asList( "75", "", "", "", "0", "");
    List<String> row3 = Arrays.asList( "", "", "-2", "9", "", "11");
    List<List<String>> num = Arrays.asList( row1, row2, row3);

    String exerciseName = "Exercise 1";
    String description = """
            Ejercicio 1
            Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los
            valores según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos
            en forma de tabla como se muestra en la figura
            """;

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
        io.write(arrayToTable(num));
    }

    public String arrayToTable(List<List<String>> arrayList) {
        StringBuilder table = new StringBuilder();
        arrayList.forEach(array -> {
            array.forEach(table::append);
            table.append("\n");
        });
        return table.toString();
    }
}

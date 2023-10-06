package mauridjango.exercise.ex_funciones;

import mauridjango.exercise.Exercise;
import mauridjango.ui.IO;

import java.util.ArrayList;

public class Exercise1 extends Exercise {

    public Exercise1(IO io) {
        super(io);
        String exerciseName = "Exercise 1";
        String description = """
                Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario
                """;
        question.add("Enter a number");
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int number = io.toInt(inputs.get(0));
        if (capicuaCheck(number)) {
            io.write("The number " + number + " is capicua");
        } else {
            io.write("The number " + number + " is not capicua");
        }
    }

    private boolean capicuaCheck(int number) {
        boolean result = true;
        String capicua = Integer.toString(number);
        for (int i = 0; i < capicua.length(); i++) {
            if (capicua.charAt(i) != capicua.charAt(capicua.length() - (i + 1))) {
                result = false;
                break;
            }
        }
        return result;
    }
}

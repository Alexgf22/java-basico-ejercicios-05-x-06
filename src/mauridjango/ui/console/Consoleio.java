package mauridjango.ui.console;

import mauridjango.ui.IO;

import java.util.Scanner;

public class Consoleio extends IO {

    public void write(String message) {
        System.out.println(message);
    }

    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();  // Read user input
    }
}

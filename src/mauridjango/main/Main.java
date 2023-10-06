package mauridjango.main;

import mauridjango.group.*;
import mauridjango.menu.Menu;
import mauridjango.ui.IO;
import mauridjango.ui.Validation;
import mauridjango.ui.console.Consoleio;
import java.util.ArrayList;
import java.util.Objects;

//TODO Cone volume output string should include cm3 or something
//TODO duble check menu output string spaces
//TODO in menu include prompts after displaying options
//TODO insert new validation i.e y/n days and others that dont require int
//TODO consider blocking in groups and implementing a back button
//TODO indexOutOfBounds exercise selection exception control

/**
 * This is the main class of the program responsible for executing exercises
 * from various groups through a menu system.
 */
public class Main {
    public static void main(String[] args) {

        boolean running = false;
        IO io = new Consoleio();

        // Create instances of different exercise groups

        ArrayList<Group> groups = new ArrayList<>();

        Menu menu = new Menu(groups, io);

        menu.startMenu();
        if (Objects.equals(io.read(), "y")) {
            running = true;
        }

        while (running) {
            io.write("Available options");
            menu.menuListGroups();
            int group = Validation.getInt(io.read());

            menu.menuListExercises(group);
            int number = Validation.getInt(io.read());

            menu.selectExercise(group, number).run();

            io.write("Continue?\ny/n?");
            if (Objects.equals(io.read(), "n")) {
                running = false;
            }
            menu.exitMenu();
        }
    }
}

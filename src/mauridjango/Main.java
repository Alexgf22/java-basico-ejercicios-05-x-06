package mauridjango;

import mauridjango.exceptions.InvalidInputException;
import mauridjango.exercise.*;
import mauridjango.exercise.ex_arraysbidemensionales.Exercise1;
import mauridjango.exercise.ex_arraysbidemensionales.Exercise2;
import mauridjango.group.*;
import mauridjango.group.Group;
import mauridjango.ui.IO;
import mauridjango.ui.console.Consoleio;

import java.util.ArrayList;

//TODO Still not sure why double spaced between groups and exercises

/**
 * This is the main class of the program responsible for executing exercises
 * from various groups through a menu system.
 */
public class Main {
    public static void main(String[] args) throws InvalidInputException {

        boolean running = false;
        IO io = new Consoleio();

        // Create instances of different exercise groups
        final Group groupBiArrays = new GroupBiArrays();
        groupBiArrays.add(
                new Exercise1(io),
                new Exercise2(io)
            );

        final Group groupSingleArrays = new GroupSingleArrays();
        groupSingleArrays.add(
                new mauridjango.exercise.ex_arrayunidimensional.Exercise1(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise2(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise3(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise5(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise7(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise9(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise11(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise13(io),
                new mauridjango.exercise.ex_arrayunidimensional.Exercise15(io)
        );

        final Group groupFunctions = new GroupFunctions();
        groupFunctions.add(
                new mauridjango.exercise.ex_funciones.Exercise1(io),
                new mauridjango.exercise.ex_funciones.Exercise3(io),
                new mauridjango.exercise.ex_funciones.Exercise5(io),
                new mauridjango.exercise.ex_funciones.Exercise7(io),
                new mauridjango.exercise.ex_funciones.Exercise9(io),
                new mauridjango.exercise.ex_funciones.Exercise11(io),
                new mauridjango.exercise.ex_funciones.Exercise13(io),
                new mauridjango.exercise.ex_funciones.Exercise15(io),
                new mauridjango.exercise.ex_funciones.Exercise17(io),
                new mauridjango.exercise.ex_funciones.Exercise19(io),
                new mauridjango.exercise.ex_funciones.Exercise21(io),
                new mauridjango.exercise.ex_funciones.Exercise23(io),
                new mauridjango.exercise.ex_funciones.Exercise25(io)
        );

        ArrayList<Group> groups = new ArrayList<>();
        groups.add(groupBiArrays);
        groups.add(groupSingleArrays);
        groups.add(groupFunctions);

        Menu menu = new Menu(groups, io);

        menu.startMenu();

        running = io.getYN();

        while (running) {
            io.write("Available options");
            menu.listGroups();
            Group group = menu.selectGroup(io.getInt());

            menu.listExercises(group);
            Exercise exercise = menu.selectExercise(group, io.getInt());

            exercise.run();

            io.write("Continue?\ny/n?");

            running = io.getYN();

            menu.exitMenu();
        }
    }
}

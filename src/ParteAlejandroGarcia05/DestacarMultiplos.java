package ParteAlejandroGarcia05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DestacarMultiplos {


    public static void resaltarMultiplos(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % num == 0) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Random rand = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < 20; i++) {
            numerosAleatorios[i] = rand.nextInt(401);
        }

        System.out.println(Arrays.toString(numerosAleatorios));


        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de\n" +
                "7):");
        int opcion = scanner.nextInt();

        System.out.println("Array con los números destacados según múltiplo:");
        if (opcion == 1) {
            resaltarMultiplos(numerosAleatorios, 5);
        } else if (opcion == 2) {
            resaltarMultiplos(numerosAleatorios, 7);
        } else {
            System.out.println("Opción no válida.");
        }

    }

}

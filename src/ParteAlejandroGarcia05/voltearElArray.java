package ParteAlejandroGarcia05;

import java.util.Scanner;

public class voltearElArray {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Array original:");
        mostrarArray(numeros);

        System.out.print("Introduce la posición inicial (0-9): ");
        int inicial = scanner.nextInt();
        System.out.print("Introduce la posición final (0-9): ");
        int finalPos = scanner.nextInt();

        numeros = rotarArray(numeros, inicial, finalPos);

        System.out.println("\nEl array final quedaría así:");
        mostrarArray(numeros);
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }

    public static int[] rotarArray(int[] array, int inicial, int finalPos) {
        if (inicial < finalPos && inicial >= 0 && inicial <= 9 && finalPos >= 0 && finalPos <= 9) {
            int temp = array[inicial];
            for (int i = inicial; i < finalPos; i++) {
                array[i] = array[i + 1];
            }
            array[finalPos] = temp;
        } else {
            System.out.println("Las posiciones inicial y final no son válidas.");
        }
        return array;
    }

}

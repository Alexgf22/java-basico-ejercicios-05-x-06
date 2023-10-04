package ParteAlejandroGarcia05;

import java.util.Arrays;
import java.util.Scanner;

public class RotarElArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];


        for(int i= 0; i < 15; i++) {
            int numero;
            while(true) {
                System.out.print("Introduce un número entero: ");
                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Error. Por favor, introduce un número entero.");
                    scanner.next();
                }
            }
            numeros[i] = numero;
        }
        System.out.println("Números sin rotar: " + Arrays.toString(numeros));
        System.out.println();

        /* Ahora cada elemento se mueve una posición hacia delante
         y el último pasa a ser el primero */
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("El array rotado quedaría así:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();

    }

}

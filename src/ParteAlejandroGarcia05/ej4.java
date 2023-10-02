package ParteAlejandroGarcia05;

import java.util.Random;

public class ej4 {

    public static void main(String[] args) {

        int[] numero = new int[20];

        int[] cuadrado = new int[20];

        int[] cubo = new int[20];

        Random rand = new Random();

        // Llenar array de numero
        for (int i = 0; i < numero.length; i++) {
            numero[i] = rand.nextInt(101);
        }

        // Llenar array de cuadrado con los cuadrados de los valores del array numero
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
        }

        // Llenar array de cubo con los cubos de los valores del array numero
        for (int i = 0; i < cuadrado.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        // Sacar los arrays en 3 columnas
        for (int i = 0; i < 20; i++) {
            System.out.print("Número: " + numero[i] + " , ");
            System.out.print("el cuadrado da : " + cuadrado[i] + " , ");
            System.out.print("el cubo da : " + cubo[i]);
            System.out.println();
        }

    }
}

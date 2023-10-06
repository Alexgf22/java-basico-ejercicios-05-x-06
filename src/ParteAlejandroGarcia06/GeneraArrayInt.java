package ParteAlejandroGarcia06;

import java.util.Arrays;
import java.util.Random;

public class GeneraArrayInt {

    public static int[] generarArray(int minimo, int maximo) {
        Random rand = new Random();
        int tamanoArray = rand.nextInt(50 - 2 + 1) + 2;
        int[] numeros = new int[tamanoArray];

        for (int i = 0; i < tamanoArray; i++) {
            numeros[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }
        return numeros;
    }

    public static void main(String[] args) {
        int minimo = 1;
        int maximo = 100;

        int[] arrayAleatorio = generarArray(minimo, maximo);

        System.out.println("Un array aleatorio con números del " + minimo + " al " + maximo + " quedaría \n" + Arrays.toString(arrayAleatorio));
    }

}

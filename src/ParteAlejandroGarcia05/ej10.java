package ParteAlejandroGarcia05;

import java.util.ArrayList;
import java.util.Random;

public class ej10 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] numerosAleatorios = new int[20];
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numerosAleatorios[i] = rand.nextInt(101);
        }

        /* Pasar números pares del índice 0 en adelante
           números impares en celdas restantes */

        for (int i = 0; i < 20; i++) {
            int numero = numerosAleatorios[i];
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
            else {
                numerosImpares.add(numero);
            }
        }

        System.out.println(numerosPares);
        System.out.println(numerosImpares);


        /* Copio los nº pares del array numerosPares al principio del array
        de numerosAleatorios y voy sumando 1 a la 'i'  */
        int i = 0;
        for (Integer numero : numerosPares) {
            numerosAleatorios[i++] = numero;
        }

        // Copio de la misma forma los nº impares al final del array 'numerosAleatorios'
        for (Integer numero : numerosImpares) {
            numerosAleatorios[i++] = numero;
        }

        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

    }
}

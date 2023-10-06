package ParteAlejandroGarcia06;

import java.util.Arrays;

public class Diagonal {

    public static int[] diagonal(int[][] arrayBidimensional, int fila, int columna, String direccion) {
        int tamano = arrayBidimensional.length;
        int[] diagonal = new int[tamano];

        if (direccion.equals("nose")) {
            for (int i = 0; i < tamano && fila + i < tamano && columna + i < tamano; i++) {
                diagonal[i] = arrayBidimensional[fila + i][columna + i];
            }
        } else if (direccion.equals("neso")) {
            for (int i = 0; i < tamano && fila + i < tamano && columna - i >= 0; i++) {
                diagonal[i] = arrayBidimensional[fila + i][columna - i];
            }
        }

        diagonal = Arrays.copyOf(diagonal, Math.min(tamano, diagonal.length));

        return diagonal;
    }

    public static void main(String[] args) {
        int[][] arraBidimensional = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int fila = 1;
        int columna = 1;
        String direccion = "nose";

        int[] diagonalResultante = diagonal(arraBidimensional, fila, columna, direccion);

        System.out.println("La diagonal " + direccion + " que comienza en la fila " + fila + " y columna " + columna + " es: ");
        for (int i = 0; i < diagonalResultante.length; i++) {
            System.out.print(diagonalResultante[i] + " ");
        }
    }
}



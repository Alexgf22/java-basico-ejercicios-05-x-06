package ParteAlejandroGarcia05_1;

import java.util.Scanner;

public class MovimientosDelAlfil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] casillasTablero = new String[8][8];

        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char columna = (char) ('a' + j);
                int fila = 8 - i;
                casillasTablero[i][j] = String.valueOf(columna) + fila;
                System.out.print(casillasTablero[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Introduce una posición en el formato letraNúmero (ejemplo: d5): ");
        String posicion = scanner.nextLine().toLowerCase();

        int fila = 8 - Character.getNumericValue(posicion.charAt(1));
        int columna = posicion.charAt(0) - 'a';

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for (int i = 1; i < 8; i++) {
            if (esCasillaValida(fila + i, columna + i)) {
                System.out.print(convertirAString(fila + i, columna + i) + " ");
            }
            if (esCasillaValida(fila + i, columna - i)) {
                System.out.print(convertirAString(fila + i, columna - i) + " ");
            }
            if (esCasillaValida(fila - i, columna + i)) {
                System.out.print(convertirAString(fila - i, columna + i) + " ");
            }
            if (esCasillaValida(fila - i, columna - i)) {
                System.out.print(convertirAString(fila - i, columna - i) + " ");
            }
        }
    }

    public static boolean esCasillaValida(int fila, int columna) {
        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
    }

    public static String convertirAString(int fila, int columna) {
        char letra = (char) (columna + 'a');
        int numero = 8 - fila;
        return "" + letra + numero;
    }
}

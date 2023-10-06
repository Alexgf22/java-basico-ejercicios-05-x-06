package ParteAlejandroGarcia06;

import java.util.Arrays;

public class FilaDeArrayBiInt {

    public static int[] filaDeArrayBiInt(int[][] arrayBi, int i) {
        return arrayBi[i];
    }

    public static void main(String[] args) {
        int[][] miArrayBi = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i = 1;

        int[] fila = filaDeArrayBiInt(miArrayBi, i);

        System.out.println("\nLa fila " + i + " del array bidimensional: \n" + Arrays.deepToString(miArrayBi) + "\n es: \n" + Arrays.toString(fila));
    }
}

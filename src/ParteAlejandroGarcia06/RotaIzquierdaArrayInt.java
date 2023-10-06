package ParteAlejandroGarcia06;

import java.util.Arrays;

public class RotaIzquierdaArrayInt {

    public static int[] rotaIzquierdaArray(int[] array, int n) {
        int longitud = array.length;
        int[] resultado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            resultado[(i - n + longitud) % longitud] = array[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 54, 65, 87, 99};
        int n = 3;

        int[] arrayRotado = rotaIzquierdaArray(array, n);

        System.out.println("El array rotado hacia la izquierda quedaría: \n" + Arrays.toString(arrayRotado));
    }

}

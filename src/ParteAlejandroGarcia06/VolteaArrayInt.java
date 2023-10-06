package ParteAlejandroGarcia06;

import java.util.Arrays;

public class VolteaArrayInt {

    public static int[] voltearArray(int[] array) {
        int[] arrayVolteado = new int[array.length];
        int posicionEnArray = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            arrayVolteado[posicionEnArray] = array[i];
            posicionEnArray += 1;
        }
        return arrayVolteado;
    }

    public static void main(String[] args) {

        int[] array = {11,22,54,65,87,99};

        int[] arrayVolteado = voltearArray(array);

        System.out.println("El array: \n" + Arrays.toString(array) + "\n Volteado quedaría: \n" + Arrays.toString(arrayVolteado));
    }


}

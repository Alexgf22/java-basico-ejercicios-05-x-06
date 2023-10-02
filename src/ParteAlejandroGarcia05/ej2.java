package ParteAlejandroGarcia05;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {

        char[] caracteres = new char[10];

        // Los valores que no sean inicializados resultarán en carácter nulo
        // que equivale a '\u0000'

        caracteres[0] = 'a';
        caracteres[1] = 'x';
        caracteres[4] = '@';
        caracteres[6] = '\u00A0';
        caracteres[7] = '+';
        caracteres[8] = 'Q';

        System.out.println("Así quedaría el array: " + Arrays.toString(caracteres));


    }

}

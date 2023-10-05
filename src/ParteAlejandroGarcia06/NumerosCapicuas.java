package ParteAlejandroGarcia06;

import java.util.ArrayList;

public class NumerosCapicuas {

    public static ArrayList<Integer> mostrarCapicuas(int minimo, int maximo) {

        ArrayList<Integer> numerosCapicuas = new ArrayList<>();
        for (int i = minimo; i < maximo; i++) {
            String numeroEnString = String.valueOf(i);
            String numeroInvertido = invertirNumero(numeroEnString);

            if (numeroEnString.equals(numeroInvertido)) {
                numerosCapicuas.add(i);
            }

        }

        return numerosCapicuas;
    }

    public static String invertirNumero(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    public static void main(String[] args) {
        int minimo = 1;
        int maximo = 99999;

        ArrayList<Integer> numerosCapicuas = mostrarCapicuas(minimo, maximo);

        System.out.println("Los números capicúas del " + minimo + " al " + maximo + " son: " + numerosCapicuas);
    }


}

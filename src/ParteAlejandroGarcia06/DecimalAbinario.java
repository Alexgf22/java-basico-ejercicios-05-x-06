package ParteAlejandroGarcia06;


public class DecimalAbinario {

    public static String pasarDecimalAbinario(int numero) {

        StringBuilder binario = new StringBuilder();
        while (numero >= 1) {
            int restoDivision = numero % 2;
            if(restoDivision % 2 == 0) {
                binario.append("0");
            }
            else {
                binario.append("1");
            }
            numero = numero / 2;
        }


        return invertirBinario(String.valueOf(binario));

    }


    public static String invertirBinario(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }


    public static void main(String[] args) {
        int numeroDecimal = 95;

        String numeroEnBinario = pasarDecimalAbinario(numeroDecimal);

        System.out.println("El número " + numeroDecimal + " pasado a binario sería: " + numeroEnBinario);
    }
}

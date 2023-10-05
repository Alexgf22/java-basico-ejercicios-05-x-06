package ParteAlejandroGarcia06;

public class EsPrimo {

    static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int numero = 22;
        boolean resultado = esPrimo(numero);
        System.out.println("¿El " + numero + " es un número primo? " + resultado);
    }



}

package ParteAlejandroGarcia06;

public class PegaPorDelante {

    public static int pegaPorDelante(int numero, int digito) {
        String numeroEnString = String.valueOf(numero);
        String digitoEnCaracter = String.valueOf(digito);

        String resultadoString = digitoEnCaracter + numeroEnString;

        return Integer.parseInt(resultadoString);
    }

    public static void main(String[] args) {
        int numero = 3827689;
        int digito = 6;

        int numeroModificado = pegaPorDelante(numero, digito);

        System.out.println("Si le añadimos el dígito: " + digito + " al número: " + numero + " por delante quedaría: "  + numeroModificado);
    }


}

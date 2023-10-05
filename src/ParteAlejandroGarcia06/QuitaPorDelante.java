package ParteAlejandroGarcia06;

public class QuitaPorDelante {

    public static int quitaPorDelante(int numero, int n) {
        String numeroEnString = String.valueOf(numero);

        if (n >= numeroEnString.length()) {
            return 0;
        }

        String resultadoString = numeroEnString.substring(n);

        return Integer.parseInt(resultadoString);
    }

    public static void main(String[] args) {
        int numero = 3827589;
        int n = 3;

        int numeroModificado = quitaPorDelante(numero, n);

        System.out.println("Si le quitamos a: " + numero + " , " + n + " dígitos por la izquierda quedaría así: " + numeroModificado);
    }

}

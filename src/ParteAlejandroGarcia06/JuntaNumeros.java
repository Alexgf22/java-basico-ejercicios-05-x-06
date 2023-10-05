package ParteAlejandroGarcia06;

public class JuntaNumeros {

    public static int juntarNumeros(int numero1, int numero2) {
        String numero1EnString = String.valueOf(numero1);
        String numero2EnString = String.valueOf(numero2);

        String resultadoString = numero1EnString + numero2EnString;

        return Integer.parseInt(resultadoString);
    }

    public static void main(String[] args) {
        int numero1 = 120;
        int numero2 = 310;

        int numeroUnificado = juntarNumeros(numero1, numero2);

        System.out.println("Si juntamos los números: " + numero1 + " y " + numero2 + " quedaría: " + numeroUnificado);
    }


}

package ParteAlejandroGarcia06;

public class Voltea {

    public static int voltearNumero(int numero) {
        int numeroResultante = 0;
        while(numero != 0) {
            int digito = numero % 10;
            numeroResultante = numeroResultante * 10 + digito;
            numero = numero / 10;
        }
        return numeroResultante;
    }

    public static void main(String[] args) {
        int numero = 22123;

        int numeroVolteado = voltearNumero(numero);

        System.out.println("El número volteado quedaría así: " + numeroVolteado);
    }


}

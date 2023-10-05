package ParteAlejandroGarcia06;

public class PosicionDelDigito {

    public static int posicionDelDigito(int numero, int digito) {
        String numeroString = String.valueOf(numero);
        char digitoChar = (char) (digito + '0');

        for (int i = 0; i < numeroString.length(); i++) {
            if (numeroString.charAt(i) == digitoChar) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numero = 348569;
        int digito = 9;

        int posicion = posicionDelDigito(numero, digito);

        if (posicion != -1) {
            System.out.println("La posición del dígito " + digito + " sería la: " + posicion);
        } else {
            System.out.println("El dígito " + digito + " no se halla en el número");
        }
    }

}

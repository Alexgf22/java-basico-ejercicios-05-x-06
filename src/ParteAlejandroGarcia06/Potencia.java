package ParteAlejandroGarcia06;

public class Potencia {

    static int calcularPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int base = 6;
        int exponente = 4;

        int resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    }


}

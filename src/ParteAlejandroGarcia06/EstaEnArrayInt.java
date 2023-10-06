package ParteAlejandroGarcia06;

public class EstaEnArrayInt {

    public static boolean comprobarArray(int[] array, int numero) {
        boolean respuesta = false;
        for (int i = 0; i < array.length; i++) {
            if (respuesta) {
                break;
            }
            respuesta = array[i] == numero;

        }
        return respuesta;
    }

    public static void main(String[] args) {

        int[] array = {11,22,54,65,87,99,32,45,12,34,56,57,86};

        int numero = 22;
        boolean respuesta = comprobarArray(array,numero);

        System.out.println("¿Está el " + numero + " en el array? " + respuesta);
    }


}

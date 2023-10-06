package ParteAlejandroGarcia06;

public class MaximoArrayInt {

    public static int seleccionarNumMax(int[] array) {
        int numeroMayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numeroMayor) {
                numeroMayor = array[i];
            }
        }
        return numeroMayor;
    }

    public static void main(String[] args) {

        int[] array = {11,22,54,65,87,99,32,45,12,34,56,57,86};

        int numMaximo = seleccionarNumMax(array);

        System.out.println("El número máximo del array es: " + numMaximo);
    }

}

package ParteAlejandroGarcia06;

public class CoordenadasEnArrayBiInt {

    public static int[] coordenadasEnArrayBiInt(int[][] array, int numero) {
        int[] coordenadas = {0, 0};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numero) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return coordenadas;
                }
            }
        }

        return coordenadas;
    }

    public static void main(String[] args) {
        int[][] miArrayBi = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int numero = 9;

        int[] resultado = coordenadasEnArrayBiInt(miArrayBi, numero);

        if (resultado[0] != -1 && resultado[1] != -1) {
            System.out.println("El número " + numero + " se encuentra en la fila " + resultado[0] + " y la columna " + resultado[1]);
        } else {
            System.out.println("El número " + numero + " no se encuentra en el array.");
        }
    }


}

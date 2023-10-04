package ParteAlejandroGarcia05_1;

import java.util.Scanner;

public class SumasEnMatriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[4][5];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                // Validamos que sea un nº entero lo que se introduce
                int numero;
                while(true) {
                    System.out.print("Introduce un número entero: ");
                    if (scanner.hasNextInt()) {
                        numero = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Error. Por favor, introduce un número entero.");
                        scanner.next();
                    }
                }
                numeros[i][j] = numero;
            }
        }


        for(int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + "\t");
                sumaFila += numeros[i][j];
            }
            System.out.println("| " + sumaFila);
        }

        System.out.println("-----------------------------");

        for(int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }

        int sumaTotal = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("| " + sumaTotal);


    }

}

package ParteAlejandroGarcia05_1;

import java.util.Scanner;

public class SumasEnMatriz2 {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[4][5];

        System.out.println("Escribe un programa que pida 20 números enteros. Estos números se añaden en un array de 4 filas por 5 columnas.");
        Thread.sleep(1000);

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
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

        System.out.println("El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.");
        Thread.sleep(1000); // Pausa de 1 segundo

        for(int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + "\t");
                sumaFila += numeros[i][j];
            }
            System.out.println("| " + sumaFila);
            Thread.sleep(500);
        }

        System.out.println("-------------------------------");
        Thread.sleep(1000);

        for(int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.print(sumaColumna + "\t");
            Thread.sleep(500);
        }

        int sumaTotal = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }
        System.out.println("| " + sumaTotal);
        Thread.sleep(1000);

    }

}

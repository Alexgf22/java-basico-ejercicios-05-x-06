package ParteAlejandroGarcia05;

import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] mediaTemperaturas = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


        for (int i = 0; i < 12; i++) {
            int temperatura;
            while(true) {
                System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
                if (scanner.hasNextInt()) {
                    temperatura = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Error. Por favor, introduce un número entero.");
                    scanner.next();
                }
            }
            mediaTemperaturas[i] = temperatura;
        }


        /* En este bucle for vamos obteniendo las líneas con el caracter '*'
        de la longitud de cada temperatura media */
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            for (int j = 0; j < mediaTemperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

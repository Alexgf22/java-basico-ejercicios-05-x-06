package ParteAlejandroGarcia05;

import java.util.Scanner;

public class OrdenarColoresConPalabras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[8];

        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        int contadorColores = 0;
        int contadorNoColores = 0;

        for (int i = 0; i < 8; i++) {

            String palabra;
            while(true) {
                System.out.print("Introduce una palabra: ");
                if (scanner.hasNext()) {
                    palabra = scanner.next();
                    break;
                } else {
                    System.out.println("Error. Por favor, introduce un string.");
                    scanner.next();
                }
            }

            boolean esColor = false;

            for (String color : colores) {
                if (palabra.equalsIgnoreCase(color)) {
                    esColor = true;
                    break;
                }
            }

            if (esColor && contadorColores < 4) {
                palabras[contadorColores] = palabra;
                contadorColores++;
            } else if (contadorNoColores < 4) {
                palabras[4 + contadorNoColores] = palabra;
                contadorNoColores++;
            } else {
                System.out.println("Has introducido demasiadas palabras que no son colores.");
            }
        }

        System.out.println("\nEl array quedaría de la siguiente forma:");

        for (int i = 0; i < 8; i++) {
            System.out.println(i + " - " + palabras[i]);
        }
    }
}

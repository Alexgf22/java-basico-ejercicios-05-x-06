package ParteAlejandroGarcia05_1;

import java.util.Scanner;

public class JuegoTresEnRaya {

    static char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    static char jugadorActual = 'X';

    public static void main(String[] args) {
        while (true) {
            imprimirTablero();
            tomarJugada();
            if (haGanado(jugadorActual)) {
                imprimirTablero();
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                break;
            }
            if (esEmpate()) {
                imprimirTablero();
                System.out.println("¡Es un empate!");
                break;
            }
            cambiarJugador();
        }
    }

    static void imprimirTablero() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    static void tomarJugada() {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        do {
            System.out.print("Jugador " + jugadorActual + ", ingresa la fila (0-2) y columna (0-2) separadas por espacio (ejemplo: 0 1): ");
            fila = scanner.nextInt();
            columna = scanner.nextInt();
        } while (!esJugadaValida(fila, columna));
        tablero[fila][columna] = jugadorActual;
    }

    static boolean esJugadaValida(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    static boolean haGanado(char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) return true;
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) return true;
        }
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    static boolean esEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') return false;
            }
        }
        return true;
    }
}


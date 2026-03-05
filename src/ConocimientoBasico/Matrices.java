package ConocimientoBasico;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3]; //filas/columnas
        //asignacion manual
        matriz[0][0] = 5;
        matriz[0][1] = 6;
        matriz[0][2] = 7;
        matriz[1][0] = 8;
        matriz[1][1] = 9;
        matriz[1][2] = 10;
        matriz[2][0] = 11;
        matriz[2][1] = 12;
        matriz[2][2] = 13;

        System.out.println(matriz[0][1]);
        Scanner sca = new Scanner(System.in);

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.println("ingrese el numero de la fila " + fila + " columna " + columna);
                matriz[fila][columna] = sca.nextInt();
            }
        }
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print("["+matriz[fila][columna]+"],");
            }
            System.out.println("");
        }
    }


}

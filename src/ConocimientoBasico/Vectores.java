package ConocimientoBasico;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //Declaración
        int vector[] = new int[4];
        //asignacion manual
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 5;
        vector[3] = 9;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("es el numero: " + vector[i]);
        }

        int vector2[] = new int[3];
        for (int p = 0; p < vector2.length; p++) {
            System.out.println("ingresa el numero que va en la posicion : " + p);
            vector2[p] = sca.nextInt();
        }

        System.out.println("-----------");
        //UTILIZAMOS Arrays.toString(vector) para mostrar el vector; es una libreria para pasar a arrray.
        System.out.println("vector 1: " + Arrays.toString(vector));
        System.out.println("vector 2: " + Arrays.toString(vector2));

    }
}

package ConocimientoBasico;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosVectoresMatrices {
    public static void main(String[] args) {
        int vector[] = new int[3];
        int cont = 0;
        Scanner sca = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingresa numero: " + i);
            vector[i] = sca.nextInt();
            if (vector[i] == 3) {
                cont++;
            }
        }
        System.out.println("El vector es: " + Arrays.toString(vector));
        System.out.println("el numero 3 aparece :" + cont + " veces");


        int suma = 0;
        int matriz[][] = new int[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese las notas del alumno: " + (f + 1));
                System.out.println("nota " + (c + 1));
                matriz[f][c] = sca.nextInt();
                suma += matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0;
        }

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("[" + matriz[f][c] + "]");
            }
            System.out.println("");
        }


        String ciudades[] = new String[5];
        int tempMinima[] = new int[1];
        int tempMaxima[] = new int[1];
        int min = 1000;
        int max = 0;
        String ciudadMin="";
        String ciudadMax="";

        for (int c = 0; c < ciudades.length; c++) {
            System.out.print("Ingresa la ciudad " + (c + 1) + " : ");
            ciudades[c] = sca.next();
            for (int m = 0; m < tempMinima.length; m++) {
                System.out.print("Ingrese la tempMinima de la ciudad " + "' " + ciudades[c] + "' :");
                tempMinima[m] = sca.nextInt();
                if (tempMinima[m] < min) {
                    min = tempMinima[m];
                    ciudadMin=ciudades[c];
                }
            }
            for (int a = 0; a < tempMaxima.length; a++) {
                System.out.print("Ingrese la tempMaxima de la ciudad " + "' " + ciudades[c] + "' :");
                tempMaxima[a] = sca.nextInt();
                if (tempMaxima[a] > max) {
                    max = tempMaxima[a];
                    ciudadMax=ciudades[c];
                }
            }


        }
        System.out.println("la temperatura minima entre todas las ciudades fue de: " + min);
        System.out.println("y fue en la ciudad de: "+ciudadMin);
        System.out.println("la temperatura maxima fue de : " + max);
        System.out.println("y fue en la ciudad de: "+ciudadMax);



    }


}

package ConocimientoBasico;

import java.util.Scanner;

public class EjerciciosEstructurasRepetitivas {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        /*Ejercicio 1:
           realizar un programa que dado un numero limite por teclado
         * muestre en pantalla todos los numeros hasta ese limite*/
        System.out.println("Ejercicio 1");
        System.out.print("Ingrese numero limite");
        int limite = sca.nextInt();
        for (int i = 1; i < limite + 1; i++) {
            System.out.println(i);
        }

        /*Ejercicio 2:
         * Realizar un programa que muestre por pantalla los numeros del 200 al 250 saltando de 2 en 2. La secuencia tiene que ser 200,202,204, etc*/
        System.out.println("ejercicio 2");
        for (int i = 200; i < 250; i += 2) {
            System.out.println(i);
        }

        /*Realizar un programa que muestre por pantalla las palabras que sean ingresadas por teclado hasta que se escriba la palabra salir*/
        System.out.println("Ejercicio 3");
        boolean exit = true;
        while (exit) {
            System.out.println("Ingrese palabra: ");
            String palabra = sca.next();
            if (palabra.equals("salir")) {
                System.out.println("saliendo...");
                exit = false;
            } else {
                System.out.println(palabra);
            }
        }


        boolean fin = true;
        int cont = 0;

        while (fin) {
            System.out.println("ejercicio 4");
            System.out.println("ingrese dni: ");
            int dni = sca.nextInt();
            System.out.println("ingrese nombre: ");
            String nombre = sca.next();


            if (nombre.toLowerCase().equals("fin") && dni == 0) {
                System.out.println("fin de la inscripcion");
                fin = false;
            } else {

                System.out.println("ingrese edad: ");
                int edad = sca.nextInt();

                if (edad >= 6 && edad <= 10) {
                    System.out.println("CATEGORIA: MENORES A");
                } else if (edad >= 11 && edad <= 17) {
                    System.out.println("CATEGORIA: MENORES B");
                } else if (edad >= 18 && edad <= 30) {
                    System.out.println("CATEGORIA: JUVENILES");

                } else if (edad >= 31 && edad <= 50) {
                    System.out.println("CATEGORIA: ADULTOS");

                } else if (edad > 50) {
                    System.out.println("CATEGORIA: ADULTOS MAYORES");
                } else {
                    System.out.println("CATEGORIA NO VALIDA");
                }
                cont++;
                System.out.println("Personas registradas hasta el momento: " + cont);
            }


        }

        /*Arbolito*/

        int altura = 5;
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < (altura - i - 1); j++) {

                System.out.print(" ");
            }

            for (int p = 0; p < (i * 2) + 1; p++) {


                System.out.print("*");

            }
            System.out.println("");
        }

        //largo tronco
        int largoTronco = 2;
        for (int h = 0; h < largoTronco; h++) {
            for (int u = 0; u < (altura - 2); u++) {
                System.out.print(" ");
            }
            ;
            for (int c = 0; c < 3; c++){
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}

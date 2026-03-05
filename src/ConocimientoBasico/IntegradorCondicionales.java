package ConocimientoBasico;

import java.util.Scanner;

public class IntegradorCondicionales {
    public static void main(String[] args) {
        /*
         * una pequeña empresa desea calcular los sueldos de sus empleados.
         * Los puestos de los mismos puedesn tener 3 categorias: 1-Repositor,2-Cajero y 3-supervisor
          .Los repositores cobran $15890 + un bono del 10%
          .Los cajeros cobran $25630,98 fijos
          .Los supervisores cobran $35560,20 en bruto al cual se le descuenta un 11% de jubilacion.

          Se necesita un programa que dependiendo el tipo de empleado calcule y muestre en pantalla el correspondiente sueldo.
          */

        Scanner sca = new Scanner(System.in);

        boolean condicion = true;

        while (condicion) {
            System.out.println("Que desea hacer: ");
            System.out.println("1-ver sueldo repositor");
            System.out.println("2-ver sueldo cajero");
            System.out.println("3-ver sueldo repositor");
            System.out.println("4-salir");
            int op = sca.nextInt();

            switch (op) {
                case 1:
                    System.out.println("el sueldo de repositor es: $" + (15890 + (15890 * 0.10)));
                    break;
                case 2:
                    System.out.println("el sueldo de cajero es: $" + (25630.89));
                    break;
                case 3:
                    System.out.println("el sueldo de supervisor es: $" + (35560.20 - (35560.20 * 0.11)));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    condicion = false;
                    break;
                default:
                    System.out.println("ingrese opcion valida");
            }
        }

    }
}

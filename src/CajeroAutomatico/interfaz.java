package CajeroAutomatico;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class interfaz {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double saldo = 0;
        double ingreso = 0;
        double egreso = 0;
        boolean op = true;

        while (op) {

            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1: Consultar saldo:");
            System.out.println("2: ingresar dinero:");
            System.out.println("3: sacar dinero:");
            System.out.println("4: consultar sus ultimos mov:");
            System.out.println("5: salir:");
            int opcion = sca.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("su saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto dinero quiere ingresar? ");
                    ingreso = sca.nextDouble();
                    saldo = ingreso;
                    break;
                case 3:
                    System.out.println("cuanto dinero quiere retirar ");
                    egreso = sca.nextDouble();
                    saldo = (ingreso - egreso);
                case 4:
                    System.out.println("sus ultimos movimientos fueros ej");
                    break;
                case 5:
                    op=false;
                    System.out.println("saliendo...");
            }
        }


    }
}


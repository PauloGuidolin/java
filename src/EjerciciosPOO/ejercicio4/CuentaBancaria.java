package EjerciciosPOO.ejercicio4;

import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    Scanner sca = new Scanner(System.in);

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("su saldo es: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("su saldo es: " + saldo);

        } else {
            System.out.println("no tiene tanta plata");
        }
    }

    public void sistema() {
        System.out.println("Bienvenidos al sistema...");
        System.out.println("Para ingresar indique su nombre...");
        titular = sca.next();
        System.out.println("Bienvenido señor " + titular);

        boolean t = true;
        while (t) {
            System.out.println("Que quiere hacer: 1-ingresar dinero , 2-retirar dinero , 3-salir");
            int op = sca.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cuanto quiere ingresar? ");
                    double cantidad = sca.nextDouble();
                    depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Cuanto dinero quiere retirar? ");
                    double cant = sca.nextDouble();
                    retirar(cant);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("op incorrecta");
            }
        }
    }
}

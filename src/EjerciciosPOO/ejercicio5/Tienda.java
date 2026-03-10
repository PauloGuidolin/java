package EjerciciosPOO.ejercicio5;

import java.util.Scanner;

public class Tienda {
    Scanner sca = new Scanner(System.in);
    TarjetaCredito tc = new TarjetaCredito();
    Paypal paypal = new Paypal();

    public void realiarCompra(double monto) {
        boolean t = true;
        while (t) {
            System.out.println("El monto a pagar es de " + monto);
            System.out.println("Que desea hacer? 1-pagar con tarjeta de credito , 2-con paypal");
            int op = sca.nextInt();
            switch (op) {
                case 1:
                    tc.procesarPago(monto);
                    break;
                case 2:
                    paypal.procesarPago(monto);
                    break;
                case 3:
                    t = false;
                    System.out.println("salendo...");
                    break;
                default:
                    System.out.println("op incorrecta");

            }
        }
    }

}

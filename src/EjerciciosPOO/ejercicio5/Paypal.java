package EjerciciosPOO.ejercicio5;

public class Paypal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Usted pago " + monto + " con paypal");

    }
}

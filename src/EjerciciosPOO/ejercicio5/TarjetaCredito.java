package EjerciciosPOO.ejercicio5;

public class TarjetaCredito implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Usted pago "+monto+" con tarjeta de credito");
    }
}

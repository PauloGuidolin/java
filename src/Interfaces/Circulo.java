package Interfaces;

public class Circulo implements Figura, Rotable, Dibujable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = radio * pi;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Yo puedo rotar");
    }

    @Override
    public void dibujar() {
        System.out.println("tambien puedo ser dibujado");
    }
}

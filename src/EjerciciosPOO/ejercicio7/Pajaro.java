package EjerciciosPOO.ejercicio7;

public class Pajaro extends Animal {
    public Pajaro() {
    }

    public Pajaro(String nombre, String especie) {
        super(nombre, especie);
    }



    @Override
    public void hacerSonido() {
        System.out.println("Soy un pajaro y hago pio pio");
    }
}

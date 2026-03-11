package EjerciciosPOO.ejercicio7;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String especie) {
        super(nombre, especie);
    }


    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato y hago miau");

    }
}

package EjerciciosPOO.ejercicio7;

public class Perro extends Animal {
    public Perro() {
    }

    public Perro(String nombre, String especie) {
        super(nombre, especie);
    }




    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y hago guau");
    }
}

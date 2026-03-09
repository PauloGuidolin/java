package SobreEscrituraYSobrecarga;

public class Perro extends Animal {
    private int idPerro;
    private String raza;


    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro");
    }
}

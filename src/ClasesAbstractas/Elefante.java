package ClasesAbstractas;

public class Elefante extends Animal {
    private String peso;
    private String tamañoOrejas;

    public Elefante() {
    }

    public Elefante(String color, String raza, String epoca, String peso, String tamañoOrejas) {
        super(color, raza, epoca);
        this.peso = peso;
        this.tamañoOrejas = tamañoOrejas;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamañoOrejas() {
        return tamañoOrejas;
    }

    public void setTamañoOrejas(String tamañoOrejas) {
        this.tamañoOrejas = tamañoOrejas;
    }

    @Override
    public void hacerSonido() {
        System.out.println("hace puuuffff");
    }


}

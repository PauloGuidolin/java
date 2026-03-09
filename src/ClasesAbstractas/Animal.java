package ClasesAbstractas;

public abstract class Animal {

    protected String color;
    protected String raza;
    protected String epoca;

    public Animal() {
    }

    public Animal(String color, String raza, String epoca) {
        this.color = color;
        this.raza = raza;
        this.epoca = epoca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public abstract void hacerSonido();
}

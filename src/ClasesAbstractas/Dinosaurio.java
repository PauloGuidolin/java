package ClasesAbstractas;

public class Dinosaurio extends Animal {

    private String come;

    public Dinosaurio() {
    }

    public Dinosaurio(String color, String raza, String epoca, String come) {
        super(color, raza, epoca);
        this.come = come;
    }


    public String getCome() {
        return come;
    }

    public void setCome(String come) {
        this.come = come;
    }

    @Override
    public void hacerSonido() {
        this.raza = "velociraptor";
        setCome("carnivoro");
        System.out.println("la raza: " +this.raza+" es "+getCome());
    }
}

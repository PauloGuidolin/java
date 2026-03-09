package EjercicioIntegrador;

public class Main {
    public static void main(String[] args) {
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Squirtle sq = new Squirtle();
        Bulbasur bul = new Bulbasur();

        pika.atacarArañazo();
        pika.atacarImpactoTrueno();
        charm.atacarMordisco();
        charm.atacarLanzallamas();
        sq.atacarMordisco();
        sq.atacarBurbuja();
        bul.atacarParalizar();
        bul.atacarPlacaje();
    }
}

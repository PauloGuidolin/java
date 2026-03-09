package EjercicioIntegrador;

public class Pikachu extends Pokemon implements IElectrico{
    @Override
    public void atacarImpactoTrueno() {
        System.out.println("Hola soy pikachu y estoy uzando el ataque 'trueno' ");

    }

    @Override
    public void atacarPuñotrueno() {
        System.out.println("Hola soy pikachu y estoy uzando el ataque 'puñotureno' ");

    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy pikachu y estoy uzando el ataque 'rayocarga' ");

    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy pikachu y estoy uzando el ataque 'placaje' ");

    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy pikachu y estoy uzando el ataque 'arañazo' ");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy pikachu y estoy uzando el ataque 'mordisco' ");

    }
}

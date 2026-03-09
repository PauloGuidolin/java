package Herencia_Polimorfismo;

public class Herencia_Polimorfismo {
    public static void main(String[] args) {
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Estudiante();
        vector[3] = new Jefe();

        Persona perso = new Persona();
        Empleado em = new Empleado();

        perso = em;

    }
}

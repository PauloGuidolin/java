package EjerciciosPOO.ejercicio3;

import java.util.Scanner;

public class Programador extends Empleado {
    Scanner sca = new Scanner(System.in);
    private String lenguajePrincipal;

    public Programador() {
    }

    public Programador(String nombre, int id, double sueldoBase, String lenguajePrincipal) {
        super(nombre, id, sueldoBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public void ingresarSueldoBaseProgramador() {
        System.out.println("Ingrese sueldo base de programador: ");
        sueldoBase = sca.nextDouble();

    }

    @Override
    public double calcularSalario() {
        return getSueldoBase() + 500;
    }
}

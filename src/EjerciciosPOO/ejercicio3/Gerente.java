package EjerciciosPOO.ejercicio3;

import java.util.Scanner;

public class Gerente extends Empleado {
    Scanner sca = new Scanner(System.in);
    private double bonoAnual;

    public Gerente() {
    }

    public Gerente(String nombre, int id, double sueldoBase, double bonoAnual) {
        super(nombre, id, sueldoBase);
        this.bonoAnual = bonoAnual;
    }

    public void ingresarSueldoBaseYBonoAnualGerente() {
        System.out.println("Ingrese sueldo base de gerente: ");
        sueldoBase = sca.nextDouble();
        System.out.println("Ingrese bonoAnual: ");
        bonoAnual = sca.nextDouble();
    }

    @Override
    public double calcularSalario() {
        double salario = sueldoBase + bonoAnual;
        return salario;
    }

}

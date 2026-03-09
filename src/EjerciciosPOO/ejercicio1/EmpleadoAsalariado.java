package EjerciciosPOO.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpleadoAsalariado extends Empleado {
    private double salarioFijo;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(String nombre, int id, double salarioBase, double salarioFijo) {
        super(nombre, id, salarioBase);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    List<EmpleadoAsalariado> ea = new ArrayList<EmpleadoAsalariado>();

    public void crearEmpleadoAsalariado() {
        Scanner sca = new Scanner(System.in);
        boolean c = true;

        while (c) {
            System.out.println("Desea crear un empleado asalariado S/N?");
            String op = sca.next();
            if (op.toLowerCase().equals("s")) {
                System.out.println("ingrese nombre del empleado: ");
                nombre = sca.next();
                setNombre(nombre);
                System.out.println("ingrese id: ");
                id = sca.nextInt();
                setId(id);
                System.out.println("ingrese salarioBase");
                setSalarioBase(sca.nextDouble());
                System.out.println("ingrese salario fijo");
                salarioFijo = sca.nextDouble();
                EmpleadoAsalariado a = new EmpleadoAsalariado(nombre, id, salarioFijo, getSalarioBase());
                ea.add(a);
            } else {
                c = false;
                System.out.println("saliendo");
            }


        }

    }

    public void recorrerEmpleados() {

        for (EmpleadoAsalariado empa : ea) {

            System.out.print("id: ");
            System.out.println(empa.id);
            System.out.print("Nombre: ");
            System.out.println(empa.nombre);
            System.out.print("salario base: ");
            System.out.println(empa.getSalarioBase());
            System.out.print("salario fijo: ");
            System.out.println(calcularSalario());
            System.out.println("-----------------");

        }
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;

    }


}

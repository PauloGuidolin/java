package EjerciciosPOO.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Empleado pr;
        Empleado ger;
        pr = new Programador();
        ger = new Gerente();


        List<Empleado> listaEmpleados = new ArrayList<Empleado>();


        boolean t = true;
        while (t) {
            System.out.println("Que desea hacer? 1-ver salario de programador, 2-ver salario de gerente, 3-ver salarios, 4-salir");
            int op = sca.nextInt();
            switch (op) {
                case 1:
                    Programador programador = new Programador();
                    programador.ingresarSueldoBaseProgramador();
                    listaEmpleados.add(programador);
                    break;
                case 2:
                    Gerente gerente = new Gerente();
                    gerente.ingresarSueldoBaseYBonoAnualGerente();
                    listaEmpleados.add(gerente);
                    break;
                case 3:
                    for (Empleado e : listaEmpleados) {
                        System.out.println("Salario: " + e.calcularSalario());
                    }
                    break;
                case 4:
                    System.out.println("saliendo....");
                    t = false;
                    break;
                default:
                    System.out.println("op incorrecta");

            }
        }


    }
}

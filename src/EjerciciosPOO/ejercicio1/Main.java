package EjerciciosPOO.ejercicio1;

public class Main {
    /* 1. Sistema de Gestión de Empleados (Herencia y Polimorfismo)
Este es un clásico para entender cómo diferentes clases comparten lógica pero se comportan de forma distinta.

Clase Base (Empleado): Debe ser abstract. Atributos: nombre, id y salarioBase. Método abstracto: calcularSalario().

Subclase (EmpleadoAsalariado): El salario es fijo.

Subclase (EmpleadoPorHoras): El salario se calcula multiplicando horasTrabajadas por tarifaHora.

Reto: Crea una lista de empleados (ArrayList<Empleado>) y recorre la lista llamando al método calcularSalario() para demostrar el polimorfismo. */

    public static void main(String[] args) {
        EmpleadoAsalariado ea = new EmpleadoAsalariado();
        ea.crearEmpleadoAsalariado();
        ea.recorrerEmpleados();
        System.out.println("----------");
        EmpleadoPorHoras eph = new EmpleadoPorHoras("foca", 3, 400, 4);
        eph.calcularSalario();
        eph.mostrar();
    }

}

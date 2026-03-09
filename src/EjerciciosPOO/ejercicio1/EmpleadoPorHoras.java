package EjerciciosPOO.ejercicio1;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHoras(String nombre, int id, double salarioBase, int horasTrabajadas) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public double calcularSalario() {
        return getSalarioBase() * horasTrabajadas;
    }

    public void mostrar() {
        System.out.print("El salario de " + nombre + " es: ");
        System.out.println(calcularSalario());

    }
}

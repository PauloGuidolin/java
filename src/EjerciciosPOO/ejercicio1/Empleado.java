package EjerciciosPOO.ejercicio1;

public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double SalarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        SalarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

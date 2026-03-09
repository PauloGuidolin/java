package Herencia_Polimorfismo;

public class Empleado extends Persona {
    String turno;
    String especialidad;
    int legajo;
    double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String turno, String especialidad, int legajo, double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.turno = turno;
        this.especialidad = especialidad;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

package Herencia_Polimorfismo;

public class Estudiante extends Persona {
    String universidad;
    int cantMaterias;
    String carrera;
    int cursoActual;

    public Estudiante() {
    }

    public Estudiante(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String universidad, int cantMaterias, String carrera, int cursoActual) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.universidad = universidad;
        this.cantMaterias = cantMaterias;
        this.carrera = carrera;
        this.cursoActual = cursoActual;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getCantMaterias() {
        return cantMaterias;
    }

    public void setCantMaterias(int cantMaterias) {
        this.cantMaterias = cantMaterias;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(int cursoActual) {
        this.cursoActual = cursoActual;
    }
}

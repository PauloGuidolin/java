package Herencia_Polimorfismo;

public class Jefe extends Persona{
    String sector;
    int legajoJefe;

    public Jefe() {
    }

    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String sector, int legajoJefe) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.sector = sector;
        this.legajoJefe = legajoJefe;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getLegajoJefe() {
        return legajoJefe;
    }

    public void setLegajoJefe(int legajoJefe) {
        this.legajoJefe = legajoJefe;
    }
}

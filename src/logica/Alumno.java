package logica;

import java.util.Scanner;

public class Alumno {
    Scanner sca = new Scanner(System.in);
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre() {
        System.out.println("Ingresa tu nombre:");
        setNombre(sca.next());
        System.out.println("Hola soy " + getNombre());

    }

    public void aprobo(int nota) {
        if (nota > 7) {
            System.out.println("Aprobo");
        } else {
            System.out.println("desaprobo");
        }
    }
}

package EjerciciosPOO.ejercicio6;

import java.util.Scanner;

public class LibroService {
    Scanner sca = new Scanner(System.in);
    Libro libro = new Libro();

    public void crearLibro() {
        System.out.print("Ingrese nombre del libro: ");
        libro.setTitulo(sca.nextLine());
        System.out.print("Ingrese autor: ");
        libro.setAutor(sca.nextLine());
        System.out.println("Ingrese isbn");
        libro.setIsbn(sca.nextInt());
    }

    public void prestar() {
        if (libro.isPrestado() == false) {
            libro.setPrestado(true);
            System.out.println("Su libro fue prestado");
        }
    }

    public void devolver() {
        libro.setPrestado(false);
        System.out.println("Su libro fue devuelto");
    }

    public void informacion() {
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Isbn: " + libro.getIsbn());
        System.out.println("Estado: " + libro.isPrestado());
    }
}

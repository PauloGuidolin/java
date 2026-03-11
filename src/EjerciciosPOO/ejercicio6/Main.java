package EjerciciosPOO.ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        LibroService ls = new LibroService();
        boolean t = true;
        while (t) {
            System.out.println("Que quiere hacer? \n 1-Crear Libro \n 2-prestar Libro \n 3-devolver libro \n 4-ver info");
            int op = sca.nextInt();
            switch (op){
                case 1:
                    ls.crearLibro();
                    break;
                case 2:
                    ls.prestar();
                    break;
                case 3:
                    ls.devolver();
                    break;
                case 4:
                    ls.informacion();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    t=false;
                    break;
                default:
                    System.out.println("op incorrecta");
            }
        }
    }
}

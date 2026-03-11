package EjerciciosPOO.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalService {
    Scanner sca = new Scanner(System.in);
    Gato gato = new Gato();
    Perro perro = new Perro();
    Pajaro pajaro = new Pajaro();
    List<Animal> listaAnimales = new ArrayList<Animal>();


    public void crearanimales() {
        boolean t = true;
        while (t) {
            System.out.println("Que  desea hacer? 1-perro, 2-gato, 3-pajaro, 4-verLista, 5-salir");
            int op = sca.nextInt();
            if (op >= 1 && op <= 3) {
                System.out.print("Nombre: ");
                String n = sca.next();
                System.out.print("Especie: ");
                String e = sca.next();
                switch (op) {

                    case 1 -> listaAnimales.add(new Perro(n, e));
                    case 2 -> listaAnimales.add(new Gato(n, e));
                    case 3 -> listaAnimales.add(new Pajaro());


                }
            } else if (op == 4) {
                mostrarLista();
            } else if (op == 5) {
                System.out.println("saliendo..");
                t = false;
            } else {
                System.out.println("op incorrecta");
            }

        }
    }


    public void mostrarLista() {
        for (Animal ani : listaAnimales) {
            System.out.println("Nombre: " + ani.getNombre());
            ani.hacerSonido();
        }
    }


}

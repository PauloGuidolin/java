package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Persona per = new Persona();

        //ARRAYLIST
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Paulo", 23));
        lista.add(new Persona(2, "Pepe", 21));
        lista.add(new Persona(3, "Cami", 22));

        //borrar
        lista.remove(1);

        //foreach
        for (Persona perso : lista) {
            System.out.println(perso.getNombre());
            System.out.println(perso.getId());
            System.out.println(perso.getEdad());
        }


        //LINKEDLIST
        LinkedList<Persona> linke = new LinkedList<Persona>();
        linke.add(new Persona(1, "Paula", 23));
        linke.add(new Persona(2, "Pepa", 21));
        linke.add(new Persona(3, "Came", 22));
        //agregar al principio
        linke.addFirst(new Persona(5, "patricia", 40));
        //borrar linkedlist
        for (Persona p : linke) {
            if (p.getNombre().equals("Came")) {
                linke.remove(p);
                break;
            }
        }

        for (Persona perso : linke) {
            System.out.println(perso.getNombre());
            System.out.println(perso.getId());
            System.out.println(perso.getEdad());
        }

        //tamaño lista
        System.out.println("Linkedlist: " + linke.size());

        //primer y ultimo elemento

        System.out.println("primer: " + linke.getFirst().toString());
        System.out.println("primer: " + linke.getLast().toString());

        //borrar lista
        linke.clear();

        //comprobar si estavacia

        System.out.println("Esta vacia: " + linke.isEmpty());

        //PILA
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Lista vacia: " + pila);
        System.out.println("esta vacia?: " + pila.isEmpty());

        //AGREGAR
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(3);

        //recorrido
        for (Integer pil : pila) {
            System.out.println(pil);
        }

        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia: " + pila.isEmpty());

        //eliminar ulimo ele
        pila.pop();
        //buscar un elementp
        System.out.println("esa el 3? " + pila.search(3));
        //ulimo ele que se ingreso
        System.out.println("ultimo: " + pila.peek());
    }
}
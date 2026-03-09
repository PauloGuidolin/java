package EjerciciosPOO.Ejercicio2.Services;

import EjerciciosPOO.Ejercicio2.clases.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductoService {
    Scanner sca = new Scanner(System.in);
    Producto pr = new Producto();
    List<Producto> listaProductos = new ArrayList<Producto>();

    public void crearPr() {
        boolean op = true;
        while (op) {
            System.out.println("Desea crear un producto? s/n");
            String opc = sca.next();
            if (opc.toLowerCase().equals("s")) {
                System.out.print("ingresa nombre del producto: ");
                pr.setNombre(sca.next());
                System.out.print("Igresa precio: ");
                pr.setPrecio(sca.nextDouble());
                System.out.print("Ingresa stock: ");
                pr.setStock(sca.nextInt());
                Producto prr = new Producto(pr.getNombre(), pr.getPrecio(), pr.getStock());
                listaProductos.add(prr);
            } else {
                System.out.println("saliendo...");
                op = false;
            }
        }
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
}

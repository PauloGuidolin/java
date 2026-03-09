package EjerciciosPOO.Ejercicio2.Services;

import EjerciciosPOO.Ejercicio2.clases.Carrito;
import EjerciciosPOO.Ejercicio2.clases.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarritoService {
    Scanner sca = new Scanner(System.in);
    ProductoService ps = new ProductoService();
    Producto pr = new Producto();
    Carrito carro = new Carrito();
    List<Producto> carrito = new ArrayList<Producto>();
    Producto productoEncontrado = null;

    public void agregarPr(List<Producto> listarecibida) {
        boolean op = true;
        while (op) {
            System.out.println("desea agregar productos al carrito? s/n");
            String opc = sca.next();

            if (opc.toLowerCase().equals("s")) {
                System.out.println("lista de productos");

                for (Producto producto : listarecibida) {
                    System.out.println("Producto: " + producto.getNombre() + " stock: " + producto.getStock() + " precio: " + producto.getPrecio());
                }

                System.out.println("Que producto desea agregar?");
                String nombreProducto = sca.next();
                System.out.println("Que cantidad? ");
                int cantidad = sca.nextInt();

                for (Producto producto : listarecibida) {

                    if (producto.getNombre().toLowerCase().equalsIgnoreCase(nombreProducto)) {
                        productoEncontrado = producto;
                        break;

                    }

                }
                if (productoEncontrado != null && productoEncontrado.getStock() >= carro.getCantidad()) {
                    productoEncontrado.setCantidadAgregada(cantidad);
                    carrito.add(productoEncontrado);
                    productoEncontrado.setStock(productoEncontrado.getStock() - cantidad);
                    System.out.println("Producto agreegado correctamente");
                } else {
                    System.out.println("No coincide el nombre o no hay stock");
                }


            } else {
                System.out.println("saliendo de crear carro");
                op = false;
            }
        }
    }

    public void eliminarProductoPorNombre() {
        System.out.println("que producto desea eliminar?");
        String produ = sca.next();
        for (Producto pr : carrito) {
            if (produ.toLowerCase().equals(pr.getNombre())) {
                carrito.remove(pr);
            } else {
                System.out.println("No existe ese producto");
            }
        }
    }

    public double total() {
        double total = (carro.getCantidad() * pr.getPrecio());
        return total;
    }

    public void mostrarCarro() {
        double sumTotalCarro = 0;
        System.out.println("Productos en el carro");
        for (Producto carr : carrito) {
            System.out.println("nombre: " + carr.getNombre() + " cantidad: " + carr.getCantidadAgregada() + " total: " + (carr.getCantidadAgregada() * carr.getPrecio()));
            sumTotalCarro += (carr.getCantidadAgregada() * carr.getPrecio());
        }
        System.out.print("Suma total del carro: ");
        System.out.println(sumTotalCarro);

    }


}

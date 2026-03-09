package EjerciciosPOO.Ejercicio2;


import EjerciciosPOO.Ejercicio2.Services.CarritoService;
import EjerciciosPOO.Ejercicio2.Services.ProductoService;
import EjerciciosPOO.Ejercicio2.clases.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        CarritoService cs = new CarritoService();
        ProductoService ps = new ProductoService();
        boolean t = true;
        while (t) {
            System.out.println("Que desea hacer? 1-crear productos, 2-agregar productos al carro, 3-mostrar carro, 4- eliminar productos del carro, 5-salir")
            ;
            int op = sca.nextInt();
            switch (op) {
                case 1:
                    ps.crearPr();
                    break;
                case 2:
                    List<Producto> lista = ps.getListaProductos();
                    cs.agregarPr(lista);
                    break;
                case 3:
                    cs.mostrarCarro();
                    break;
                case 4:
                    cs.eliminarProductoPorNombre();
                    break;
                case 5:
                    System.out.println("salir...");
                    t = false;
                    break;
                default:
                    System.out.println("op incorrecta");
            }
        }
    }

}

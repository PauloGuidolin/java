package EjerciciosPOO.Ejercicio2.clases;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> pr = new ArrayList<Producto>();
    private int cantidad;

    public Carrito() {
    }

    public Carrito(List<Producto> pr, int cantidad) {
        this.pr = pr;
        this.cantidad=cantidad;
    }

    public List<Producto> getPr() {
        return pr;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPr(List<Producto> pr) {
        this.pr = pr;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

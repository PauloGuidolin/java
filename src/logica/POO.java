package logica;

public class POO {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno(1, "Paulo", "Guidolin");
        System.out.println("id: "+alu1.getId()+" nombre: "+alu1.getNombre()+" apellido: "+alu1.getApellido());
        alu1.mostrarNombre();
    }
}

package ConocimientoBasico;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double promedio;
        String condicionFinal;

        System.out.print("Ingrese el promedio del alumno: ");
        promedio = sca.nextDouble();
        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";

        System.out.println(condicionFinal);


    }
}

package ConocimientoBasico;

public class IntercambioValores {
    public static void main(String[] args) {

/*Realizar un progrma que permita el intercambio de valores entre dos variables.
Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
realizar las acciones necesarias para que numero pase a vale 20 y numero2 pase a vale 35.
Una vez realizado el cambio mostrar el resultado en pantalla*/


        int x = 35;
        int y = 20;
        int p = 0;

        p = x;
        x = y;
        y = p;

        System.out.println(y + " " + x);


    }
}

package Variables;

public class variables {
    public static void main(String[] args) {

        int variable1; //declaramos una variable int
        int variable2, variable3; //asi declaramos en la misma linea
        int variable4 = 23;
        variable1 = 10;
        variable2 = 5;
        variable3 = 24;


        System.out.println("el numero de variable1 es: " + variable1);
        System.out.println("el numero de variable2 es: " + variable2);
        System.out.println("el numero de variable3 es: " + variable3);
        System.out.println("el numero de variable4 es: " + variable4);


        //datos primitivos
        //Byte
        byte elMenorByte = Byte.MIN_VALUE;
        byte elMayorByte = Byte.MAX_VALUE;
        System.out.println("el menor numero de byte es: " + elMenorByte + " y el mayor es: " + elMayorByte);
        System.out.println("el menor numero de short es: " + Short.MIN_VALUE + " y el mayor es: " + Short.MAX_VALUE);
        System.out.println("el menor numero de integer es: " + Integer.MIN_VALUE + " y el mayor es: " + Integer.MAX_VALUE);
        System.out.println("el menor numero de Long es: " + Long.MIN_VALUE + " y el mayor es: " + Long.MAX_VALUE);

        float variableFloat = 5.6f;
        double variableDouble = 5.6;

        char a = 'a';

        boolean condicionTrue = true;
        boolean condicionFalse = true;


    }
}

package Variables;

public class Literales {
    public static void main(String[] args) {
        int enteroDecimal = 100;
        int enteroOctal = 0100;
        int entroHexadecimal = 0x100;

        System.out.println("enteroHexadecimal: " + entroHexadecimal);

        long numeroLong = 100L;
        double numerodouble = 2.5;
        float numeroFloat = 2.5f;
        int numeroConGuiones = 25_258_45;

        System.out.println("el numero con guiones es: " + numeroConGuiones);

        char miChar = 'b';
        char miOtroChar = '\u0062';

        System.out.println("mi otro char es: " + miOtroChar);

        char comillasimple = '\'';

        String texto = "Esto es un literal";

        boolean literalV = true;

        String stringNulo = null;


    }
}

import java.util.Scanner;

public class IntroduccionCaracteresTeclados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + " Bienvenido");
        System.out.println("Ingresa tu edad");
        int edad= scanner.nextInt();
        System.out.println("Hola "+nombre+" tienes "+edad+" años");
    }
}

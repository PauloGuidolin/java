package ConocimientoBasico;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PruebaTrainee {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String asientos[][] = new String[10][10];

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = "[L]";
            }
        }
        boolean salir = true;
        while (salir) {
            System.out.println("----BIENVENIDOS AL ESPECTACULO-----");
            System.out.println("Que desea realizar? ");
            System.out.println("1-Ver lugares disponibles ");
            System.out.println("2-Reservar lugares ");
            System.out.println("3-Salir ");
            int op = sca.nextInt();
            switch (op) {
                case 1:
                    System.out.println("LUGARES DISPONIBLES (L libre, X ocupado)");
                    for (int f = 0; f < 10; f++) {
                        System.out.print(f + " ");
                        for (int c = 0; c < 10; c++) {

                            System.out.print(asientos[f][c]);
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese fila que quiere..");
                    int fila = sca.nextInt();
                    System.out.println("Ingrese asiento que quiere...");
                    int nasiento = sca.nextInt();

                    if ((fila >= 0 && fila <= 10) && (nasiento >= 0 && nasiento <= 10)) {
                        for (int f = 0; f < 10; f++) {
                            for (int c = 0; c < 10; c++) {

                                if (asientos[fila][nasiento] == "[L]") {
                                    asientos[fila][nasiento] = "[x]";
                                    System.out.println("Lugar reservado");
                                }
                            }

                        }
                        if (asientos[fila][nasiento] == "[x]") {
                            System.out.println("Ocupado, ingrese otro");
                        }
                    }else{
                        System.out.println("Numeros incorrectos");
                    }

                    break;
                case 3:
                    salir = false;
                    System.out.println("saliendo..");
                    break;
                default:
                    System.out.println("opcion invalida");

            }


        }

    }


}

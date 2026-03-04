package Variables;

public class AlcanceDeLasVariables {
    public static void main(String[] args) {
        int dias = 0;

        while (dias < 30) {
            dias++;
            int semanas = dias / 7;
            System.out.println("dia: " + dias);
            System.out.println("semana: " + semanas);
        }
        int años = dias / 365;
    }
}

package Variables;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int numerodos = 2;
        int numerotres = 3;
        //suma
        int resultadoSuma = numerodos + numerotres;
        //Resta
        int resultadoResta = numerodos - numerotres;
        //multiplicacion
        double resultadoMultiplicacion = numerodos * numerotres;
        //division
        double resultadoDivision = (double) numerodos / numerotres;

        int resultadoModulo = numerodos % numerotres;

        System.out.println(numerodos);
        System.out.println(numerotres);
        System.out.println("la suma es: " + resultadoSuma);
        System.out.println("la resta es: " + resultadoResta);
        System.out.println("la multiplicacion es: " + resultadoMultiplicacion);
        System.out.println("la division es: " + resultadoDivision);
        System.out.println("el resto es: " + resultadoModulo);


    }
}

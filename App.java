package src.poo;

public class App {
    public static void main(String[] args) {
        Arithmetic cuentas= new Arithmetic();
        Result resultados= new Result();

        double num1= 20.5;
        double num2= 10.5;

        cuentas.sum(resultados, num1,num2);
        System.out.println("Suma  " + resultados.getResultSum() );

        cuentas.subtraction(resultados, num1, num2);
        System.out.println("Resta = " + resultados.getResultSubtraction());

        cuentas.multiplication(resultados, num1, num2);
        System.out.println("Multiplicación = " + resultados.getMultiplication());

        cuentas.division(resultados, num1, num2);
        System.out.println("División = " + resultados.getDivision());


    }
}

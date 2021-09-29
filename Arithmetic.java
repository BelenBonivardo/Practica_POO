package src.poo;

public class Arithmetic {
    public void sum(Result x , double a, double b){
        x.setResultSum(a+b);


    }
    public void subtraction(Result x , double a, double b){
       x.setResultSubtraction(a - b);
    }
    public void multiplication(Result x , double a, double b){
        x.setMultiplication(a * b);

    }
    public void division(Result x , double a,double b){
        x.setDivision(a / b);
    }

}

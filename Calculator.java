public class Calculator {
    private double result=0;
    private double number;


    public void add(double number) {
        result+=number;
    }

    public void subtract(double number) {

        result-=number;

    }

    public void multiply(double number) {
        result*= number;

    }
    public void divide(double number) {
        if(number == 0 ) {
            System.out.println("*Invalid Input");
        }
        else {
            result/=number;

        }

    }

    public double getResult() {
        return result;
    }

}

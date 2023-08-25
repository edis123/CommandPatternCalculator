public class Multiply implements Command{

    Calculator calc;
    private double number;



    public Multiply(Calculator calc, double number) {
        super();
        this.calc = calc;
        this.number = number;
    }



    @Override
    public void execute() {
        // TODO Auto-generated method stub
        calc.multiply(number);
    }
    @Override
    public void unexecute() {
        calc.divide(number);
    }

    @Override
    public String toString1() {

        return " *"+number;
    }
}

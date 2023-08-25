public class Division implements Command{

    Calculator calc;
    private double number;



    public Division(Calculator calc, double number) {
        super();
        this.calc = calc;
        this.number = number;
    }



    @Override
    public void execute() {
        // TODO Auto-generated method stub
        calc.divide(number);
    }
    @Override
    public void unexecute() {
        calc.multiply(number);
    }

    @Override
    public String toString1() {

        return " /"+number;
    }

}

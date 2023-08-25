public class Subtraction implements Command{
    Calculator calc;
    private double number;

    public Subtraction(Calculator calc, double number) {
        super();
        this.calc = calc;
        this.number = number;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        calc.subtract(number);
    }

    @Override
    public void unexecute() {
        calc.add(number);
    }

    @Override
    public String toString1() {

        return " -" + number;
    }

}

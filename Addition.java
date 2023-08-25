public class Addition implements Command{

    Calculator calc;
    private double number;

    public Addition(Calculator calc, double number) {
        super();
        this.calc = calc;
        this.number = number;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        calc.add(number);
    }

    @Override
    public void unexecute() {
        calc.subtract(number);
    }

    @Override
    public String toString1() {

        return " +" + number;
    }


}

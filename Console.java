import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("COMMANDER CALCULATOR");
        System.out.println(" Q-quit ");

        Scanner s = new Scanner(System.in);
        double input = 0;
        Scanner s1 = new Scanner(System.in);
        String input1 = "";

        Calculator calc = new Calculator();
        SetOperation op = new SetOperation();
        double temp = 0;

        while (true) {
            System.out.println("Enter a Type of Operation:");

            input1 = s.next();

            switch (input1) {

                case "+": {
                    System.out.println("Enter a Number:");
                    input = s.nextDouble();
                    Command addition = new Addition(calc, input);
                    op.setCommand(addition);
                    op.execute();
                    break;

                }
                case "-": {
                    System.out.println("Enter a Number:");
                    input = s.nextDouble();
                    Command subtraction = new Subtraction(calc, input);
                    op.setCommand(subtraction);
                    op.execute();
                    break;

                }
                case "*": {
                    System.out.println("Enter a Number:");
                    input = s.nextDouble();
                    Command multiplication = new Multiply(calc, input);
                    op.setCommand(multiplication);
                    op.execute();
                    break;

                }
                case "/": {
                    System.out.println("Enter a Number:");
                    input = s.nextDouble();
                    Command division = new Division(calc, input);
                    op.setCommand(division);
                    op.execute();
                    break;

                }
                case "b": {
                    op.unexecute();
                    break;

                }
                case "f": {
                    op.redo();
                    break;
                }

                case "q": {
                    System.out.println("BYE!");
                    System.exit(0);
                    break;

                }
            }

            System.out.println(" Result: " + calc.getResult());
        }

    }
}

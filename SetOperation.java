import java.util.Stack;

public class SetOperation {

        Command command;
        private Stack<Command> prevCommands = new Stack<>();
        private Stack<Command> unexecuteCommands = new Stack<>();

        public Command getCommand() {
            return command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }


        public void execute() {
            command.execute();
            prevCommands.push(command);
            unexecuteCommands.clear();
//		System.out.print(prevCommands);
//		System.out.print(deletedCommands);
        }

        public void unexecute() {
            if (!prevCommands.isEmpty()) {

                System.out.print("Undoing: " + prevCommands.peek().toString1());
                unexecuteCommands.push(prevCommands.peek());
                prevCommands.pop().unexecute();


            } else {
                System.out.println("No more commands in stack");
            }
//

        }

        public void redo() {
            if (unexecuteCommands.isEmpty()) {
                prevCommands.peek().execute();
                prevCommands.push(prevCommands.peek());
                System.out.println("Redoing*: " + prevCommands.peek().toString1());

            } else {

                prevCommands.push(unexecuteCommands.peek());
                unexecuteCommands.pop().execute();
                System.out.println("Redoing: " + prevCommands.peek().toString1());
            }
        }

    }


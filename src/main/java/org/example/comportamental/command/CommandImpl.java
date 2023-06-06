package org.example.comportamental.command;

public class CommandImpl {
    public static void main(String[] args) {
        Application application = new Application();

        User user = new User(
                new RunCommand(application),
                new ChangeCommand(application),
                new DeleteCommand(application)
        );

        user.runCommand();
        user.changeCommand();
        user.deleteCommand();
    }
}

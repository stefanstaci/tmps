package org.example.comportamental.command;

public class ChangeCommand implements Command{
    Application application;

    public ChangeCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        application.change();
    }
}

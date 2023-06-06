package org.example.comportamental.command;

public class DeleteCommand implements Command{
    Application application;

    public DeleteCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        application.delete();
    }
}

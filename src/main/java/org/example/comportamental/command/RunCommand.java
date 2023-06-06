package org.example.comportamental.command;

public class RunCommand implements Command{
    Application application;

    public RunCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        application.run();
    }
}

package org.example.comportamental.command;

public class User {
    Command run;
    Command change;
    Command delete;

    public User(Command run, Command change, Command delete) {
        this.run = run;
        this.change = change;
        this.delete = delete;
    }

    public void runCommand() {
        run.execute();
    }

    public void changeCommand() {
        change.execute();
    }

    public void deleteCommand() {
        delete.execute();
    }
}

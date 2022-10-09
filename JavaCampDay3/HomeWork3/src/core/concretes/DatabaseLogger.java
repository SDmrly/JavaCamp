package core.concretes;

import core.abstracts.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Logged to Database");
    }
}

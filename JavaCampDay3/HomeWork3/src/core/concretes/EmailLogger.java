package core.concretes;

import core.abstracts.Logger;

public class EmailLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Logged to Email");
    }
}

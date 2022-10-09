package core.concretes;

import core.abstracts.Logger;

public class FileLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Logged to file");
    }
}

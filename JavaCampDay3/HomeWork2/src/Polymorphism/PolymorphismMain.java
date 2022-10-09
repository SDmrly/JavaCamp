package Polymorphism;

public class PolymorphismMain {
    public void main() {
        /*EmailLogger logger = new EmailLogger();
        logger.log("Email loglandi");

        BaseLogger[] loggers = new BaseLogger[]
                {new DatabaseLogger(), new FileLogger(),
                        new EmailLogger(), new ConsoleLogger()};

        for (BaseLogger logger1 : loggers) {
            logger1.log("log mesaji");
        }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}

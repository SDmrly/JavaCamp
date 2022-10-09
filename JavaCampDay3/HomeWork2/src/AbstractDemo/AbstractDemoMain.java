package AbstractDemo;

public class AbstractDemoMain {
    public void main() {
        CustomerManager customerManager = new CustomerManager(new MySqlManager());
        customerManager.getCustomers();
    }
}

package Interfaces;

public class InterfacesMain {
    public void main() {
        CustomerDao customerDao = new MySqlCustomerDao();
        customerDao.add();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
        customerManager.add();
    }
}

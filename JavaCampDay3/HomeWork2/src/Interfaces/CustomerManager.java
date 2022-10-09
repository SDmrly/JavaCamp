package Interfaces;

public class CustomerManager {
    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add() {
        System.out.println("Musteri eklendi.");
        customerDao.add();
    }
}

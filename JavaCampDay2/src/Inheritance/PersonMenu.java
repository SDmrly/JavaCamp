package Inheritance;

public class PersonMenu {
    public void personManager() {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.add();
        customerManager.add();
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");


        CreditManager creditManager = new CreditManager();
        creditManager.calculate(customer);
        creditManager.calculate(customer);
        creditManager.save(customer);

        Company company = new Company();
        company.setId(100);
        company.setCity("Ankara");
        company.setTaxNumber("10000");
        company.setCompanyName("Arçelik");

        Person person = new Person();
        person.setId(10);
        person.setCity("Ankara");
        person.setFirstName("Engin");
        person.setLastName("Demiroğ");
        person.setNationalIdentity("5050505");

        CustomerManager customerManager = new CustomerManager(new MilitaryCreditManager(), new Customer());
        customerManager.save(person);
        customerManager.giveCredit();

    }
}

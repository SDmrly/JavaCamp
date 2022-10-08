public class CustomerManager{
    private CreditService creditService;
    private Customer customer;

    public CustomerManager(CreditService creditService, Customer customer) {
        this.creditService = creditService;
        this.customer = customer;
    }

    public void save(Customer customer) {
        System.out.println("Kaydedildi.");
    }

    public void delete(Customer customer) {
        System.out.println("silindi");
    }

    public void giveCredit() {
        creditService.calculate();
        creditService.save();

    }
}

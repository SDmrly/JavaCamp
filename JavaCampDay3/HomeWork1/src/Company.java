public class Company extends Customer {
    private String taxNumber;
    private String companyName;

    public Company() {

    }

    public Company(int id, String city, String taxNumber, String companyName) {
        super(id, city);
        this.taxNumber = taxNumber;
        this.companyName = companyName;
    }

    public Company(String taxNumber, String companyName) {
        this.taxNumber = taxNumber;
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

package Overriding;

public class StudentCreditManager extends BaseCreditManager {
    public double hesapla(double amount) {
        return amount * 1.10;
    }
}

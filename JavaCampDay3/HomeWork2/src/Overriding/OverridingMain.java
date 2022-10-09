package Overriding;

public class OverridingMain {
    public void main() {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{
                new TeacherCreditManager(), new AgriCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println("Odenicek tutar: " + creditManager.hesapla(1000));
        }
    }
}

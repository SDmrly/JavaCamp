package AbstractDemo;

public class MySqlManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Veri getirildi: MySql");
    }
}

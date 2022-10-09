package Interfaces;

public class MySqlCustomerDao implements CustomerDao {
    @Override
    public void add() {
        System.out.println("Mysql Eklendi");
    }
}

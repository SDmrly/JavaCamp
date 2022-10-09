package StaticDemo;

public class StaticDemo {
    public void main() {
        Product product = new Product();
        product.id = 10;
        product.name = "Mouse";
        product.price = 100;

        ProductManager productManager = new ProductManager();
        productManager.add(product);


        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }
}

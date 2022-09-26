package Fields;

public class ProductMenu {
    public void productManager() {
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Black");

        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }
}

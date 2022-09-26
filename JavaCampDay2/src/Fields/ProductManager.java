package Fields;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Urun eklendi\t" + product.getName() + "\t" +product.getProductCode());
    }

}

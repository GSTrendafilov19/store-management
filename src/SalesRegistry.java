import java.util.ArrayList;
import java.util.List;

public class SalesRegistry {
    private List<Product> products;
    private List<Customer> customers;
    private List<SalesRegistry> salesRegistries;

    public SalesRegistry() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        salesRegistries = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

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

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addSaleRegistration(SalesRegistry salesRegistry) {
        salesRegistries.add(salesRegistry);
    }

    public void displayAllData() {
        System.out.println("Products:");
        for (Product product : products) {
            product.display();
        }

        System.out.println("\nCustomers:");
        for (Customer customer : customers) {
            customer.display();
        }
    }
}

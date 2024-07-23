import bean.Product;

public class TestRunner {
    public static void main(String[] args) {
        Product product1 = new Product();

        product1.setId(1);
        product1.setName("Pen");
        product1.setPrice(5.4F);

        System.out.println(product1.toString());

        Product product2 = new Product(1, "Pen", 5.4F);
        System.out.println(product2.toString());

        System.out.println("Count="+ Product.count);

    }
}
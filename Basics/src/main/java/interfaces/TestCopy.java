package interfaces;

public class TestCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product(1, "Pen", 3.4f);
        Product p2 = (Product) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
    }
}
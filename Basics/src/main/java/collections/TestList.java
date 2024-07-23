package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(11, "Pen", 13.5F));
        products.add(new Product(5, "Eraser", 1.5F));
        products.add(new Product(79, "Notebook", 7.5F));

        Collections.sort(products);
        System.out.println("Sort by id");
        System.out.println(products);

        Collections.sort(products,new ProductPriceSorter());
        System.out.println("Sort by price");
        System.out.println(products);


    }
}
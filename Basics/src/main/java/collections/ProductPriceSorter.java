package collections;

import java.util.Comparator;

public class ProductPriceSorter implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {

//       return  (p1.getPrice() > p2.getPrice()) ? 1 : (p1.getPrice() < p2.getPrice()) ? -1 : 0 ;

        if (p1.getPrice() > p2.getPrice())
            return 1;
        else if (p1.getPrice() < p2.getPrice())
            return -1;
        return 0;
    }
}
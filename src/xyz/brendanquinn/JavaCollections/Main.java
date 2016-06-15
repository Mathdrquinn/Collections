package xyz.brendanquinn.JavaCollections;

import xyz.brendanquinn.Products.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<Product>();

        products.add(door);
        products.add(floorPanel);
        products.add(window);

        final Iterator<Product> productIterator = products.iterator();

        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }

        System.out.println();

        System.out.println(products.size());
        System.out.println(products.isEmpty());

        System.out.println(products.contains(window));
        System.out.println(products.contains(door));

        System.out.println();

        Collection<Product> otherProducts = new ArrayList<Product>();
        otherProducts.add(door);
        otherProducts.add(floorPanel);
        System.out.println(products.containsAll(otherProducts));
        System.out.println(otherProducts);

        System.out.println();

        otherProducts.remove(floorPanel);
        otherProducts.add(window);
        System.out.println(otherProducts);

        System.out.println();

        System.out.println(products.containsAll(otherProducts));
        products.removeAll(otherProducts);
        System.out.println(products);
    }
}

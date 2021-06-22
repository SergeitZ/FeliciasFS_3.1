package com.company;
import java.util.*;

@SuppressWarnings("ALL")
public class Main {

    static void displayProducts(List<Product> products) {
        for (Object product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Fruit("Banana", "Fruit"));
        products.add(new Fruit("Apple", "Fruit"));
        products.add(new Fruit("Peach", "Fruit"));

        products.add(new Meat("Chicken", "Meat"));
        products.add(new Meat("Beef", "Meat"));
        products.add(new Meat("Pork", "Meat"));

//        displayProducts(products);

//        displayByType.displayByType(products, "Fruit");

        displayByType.displayByTypeSwitch(products, "Meat");

//        displayByType.displayByIndex(products, 3);

    }
}

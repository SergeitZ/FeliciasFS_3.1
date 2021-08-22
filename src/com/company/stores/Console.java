package com.company.stores;
import com.company.Display;
import com.company.Fruit;
import com.company.Meat;
import com.company.Product;

import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    Store store = new Store();

    public void run() {
        System.out.println("\tWelcome to Felicia's Fruit Stand\nPlease make a selection from the menu below");
        String selection;
        do  {
            System.out.println("Current Store balance: " + NumberFormat.getCurrencyInstance().format(store.getBalance()));
            System.out.print("""
                (1) Buy a product
                (2) Sell a product
                (3) Display available Fruits
                (4) Display available Meats
                (E) Exit program
                Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> addProduct();
                case "2" -> sellProduct();
                case "3" -> Display.displayByType(store.products, "Fruit");
                case "4" -> Display.displayByType(store.products, "Meat");
            }
        } while (!selection.equals("E"));
        System.out.println("Thank you!");
    }

    public void addProduct() {
        System.out.print("What type of product would like to add\n(F) Fruit\n(M) Meat\nSelection: ");
        String selection = scanner.nextLine();
        switch (selection.toUpperCase(Locale.ROOT)) {
            case "F" -> addFruit();
            case "M" -> addMeat();
        }
    }

    public void sellProduct() {
        System.out.print("What type of product would like to sell\n(F) Fruit\n(M) Meat\nSelection: \n");
        String selection = scanner.nextLine();
        switch (selection.toUpperCase(Locale.ROOT)) {
            case "F" -> removeFruit();
            case "M" -> removeMeat();
        }
    }

    public void removeFruit() {
        String kind;
        Product lastFruit = null;
        System.out.println("Selling fruit.\nPlease enter fruit kind: ");
        for (Product fruit : store.products) {
            if (fruit instanceof Fruit) {
                System.out.println(fruit);
            }
        }
        kind = scanner.nextLine();
        for (Product fruit : store.products) {
            if (kind.equals(fruit.toString())) {
                store.addBalance(((Fruit) fruit).getPrice());
                lastFruit = fruit;
            }
        }
                store.products.remove(lastFruit);
    }

    public void removeMeat() {
        String kind;
        Product lastMeat = null;
        System.out.println("Selling meat.\nPlease enter meat kind: ");
        for (Product meat : store.products) {
            if (meat instanceof Meat) {
                System.out.println(meat);
            }
        }
        kind = scanner.nextLine();
        for (Product meat : store.products) {
            if (kind.equals(meat.toString())) {
                store.addBalance(((Meat) meat).getPrice());
                lastMeat = meat;
            }
        }
        store.products.remove(lastMeat);
    }

    public void addFruit() {
        String kind;
        System.out.print("Adding a new fruit.\nPlease enter fruit kind: ");
        kind = scanner.nextLine();
        store.products.add(new Fruit(kind));
        Fruit fruit = (Fruit) store.products.get(store.products.size() - 1);
        store.subtractBalance(fruit.getPrice());
    }

    public void addMeat() {
        String kind;
        System.out.print("Adding a new meat.\nPlease enter product kind: ");
        kind = scanner.nextLine();
        store.products.add(new Meat(kind));
        Meat meat = (Meat) store.products.get(store.products.size() - 1);
        store.subtractBalance(meat.getPrice());
    }
}

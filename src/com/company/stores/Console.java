package com.company.stores;
import com.company.Display;
import com.company.Fruit;
import com.company.Meat;

import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    Store store = new Store();
    String balanceFormatted = NumberFormat.getCurrencyInstance().format(store.getBalance());

    public void run() {
        System.out.println("\tWelcome to Felicia's Fruit Stand\nPlease make a selection from the menu below");
        String selection;
        do  {
            System.out.println("Current Store balance: " + balanceFormatted);
            System.out.print("""
                (1) Add a product
                (2) Display Fruits
                (3) Display Meats
                (E) Exit program
                Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> addProduct();
                case "2" -> Display.displayByType(store.products, "Fruit");
                case "3" -> Display.displayByType(store.products, "Meat");
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

    public void addFruit() {
        String kind;
        String type = "Fruit";
        System.out.print("Adding a new fruit.\nPlease enter fruit kind: ");
        kind = scanner.nextLine();
        store.products.add(new Fruit(kind, type));
    }

    public void addMeat() {
        String kind;
        String type = "Meat";
        System.out.print("Adding a new meat.\nPlease enter product kind: ");
        kind = scanner.nextLine();
        store.products.add(new Meat(kind, type));
    }
}

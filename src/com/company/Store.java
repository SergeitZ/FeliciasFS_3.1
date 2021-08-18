package com.company;
import java.util.*;

public class Store {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    protected long balance;

    public void Balance(long balance) {
        this.balance = balance;
    }

    private void setBalance(int amt) {
        balance += amt;
    }

    public long getBalance() {
        return balance;
    }

    public void addFruit() {
        String kind;
        String type = "Fruit";
        System.out.print("Adding a new fruit.\nPlease enter fruit kind: ");
        kind = scanner.nextLine();
        products.add(new Fruit(kind, type));
    }

    public void addMeat() {
        String kind;
        String type = "Meat";
        System.out.print("Adding a new meat.\nPlease enter product kind: ");
        kind = scanner.nextLine();
        products.add(new Fruit(kind, type));
    }

    public void addProduct() {
        System.out.print("What type of product would like to add\n(F) Fruit\n(M) Meat\nSelection: ");
        String selection = scanner.nextLine();
        switch (selection.toUpperCase(Locale.ROOT)) {
            case "F" -> addFruit();
            case "M" -> addMeat();
        }
    }

}

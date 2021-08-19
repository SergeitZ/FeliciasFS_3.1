package com.company;

/*
requirements
a Store class
has a store balance
stores a collection of the products it has available to purchase
can add products to the collection by spending its balance
can sell products which add to its balance and updates the collection of products
can throw away products.

Console class
runs a user interface for the cashier. is given options to
add products to the store.
throw away bad products
sell products to a client.
The main focus of version 4.0 is to ensure Encapsulation in the system.
use accurate access modifiers
 */

public class Main {

    public static void main(String[] args) {

        Console console = new Console();

        console.run();

//        Store store = new Store();
//
//        store.setBalance(100_000);

//        System.out.println(store.getBalance());

//        console.addProduct();
//        console.addProduct();
//
//        Display.displayByType(console.store.products, "Fruit");
//
//        displayByType.displayByTypeSwitch(store.products, "Meat");

    }
}

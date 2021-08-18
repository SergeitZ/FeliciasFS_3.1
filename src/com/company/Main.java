package com.company;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        store.addProduct();
        store.addProduct();

//        displayByType.displayByType(products, "Meat");
//
        displayByType.displayByTypeSwitch(store.products, "Fruit");

//        displayByType.displayByIndex(products, 3);

    }
}

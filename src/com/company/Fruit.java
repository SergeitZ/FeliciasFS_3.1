package com.company;

public class Fruit extends Product{
    private int price = 200;

    public Fruit (String kind) {
        super(kind, "Fruit");
    }

    public int getPrice() {
        return price;
    }
}

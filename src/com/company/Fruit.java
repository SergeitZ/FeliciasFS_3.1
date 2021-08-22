package com.company;

public class Fruit extends Product{
    private int price = 200;
    public Fruit (String kind, String type) {

        super(kind, type);
    }

    public int getPrice() {
        return price;
    }
}

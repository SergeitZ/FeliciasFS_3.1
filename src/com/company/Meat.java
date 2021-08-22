package com.company;

public class Meat extends Product{
    private int price = 500;

    public Meat(String kind) {
        super(kind, "Meat");
    }

    public int getPrice() {
        return price;
    }
}

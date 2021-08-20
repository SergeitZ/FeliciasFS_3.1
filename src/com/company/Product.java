package com.company;

public class Product {
    protected String kind;
    protected String type;

    public Product(String kind, String type) {
        this.kind = kind;
        this.type = type;
    }

    public String toString() {

        return kind;
    }
}

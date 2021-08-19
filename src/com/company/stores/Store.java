package com.company.stores;
import com.company.Product;

import java.util.*;

public class Store {
    List<Product> products = new ArrayList<>();
    protected long balance;

    public Store() {
        this.balance = 100_000;
    }

    protected void setBalance(int amt) {
        balance += amt;
    }

    public long getBalance() {
        return balance / 100;
    }

}

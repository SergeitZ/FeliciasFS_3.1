package com.company;
import java.util.*;

public class Store {
    List<Product> products = new ArrayList<>();
    protected long balance;

    public void Balance(long balance) {
        this.balance = balance;
    }

    public void setBalance(int amt) {
        balance += amt;
    }

    public long getBalance() {
        return balance / 100;
    }

}

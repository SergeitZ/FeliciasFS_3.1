package com.company;
import java.util.*;


public class Display {

  public static void displayByType (List<Product> products, String type) {
      System.out.println("\nAvailable products:");
      for (Product product : products) {
          if (product.type.equals(type)) {
              System.out.println(product);
          }
      }
  }

    public static void displayByTypeSwitch (List<Product> products, String type) {
        for (Product product : products) {
            switch (type) {
                case "Fruit":
                case "Meat":
                    if(product.type.equals(type)) {
                        System.out.println(product);
                    }
                    break;
            }
        }
    }
  }


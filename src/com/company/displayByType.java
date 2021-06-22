package com.company;
import java.util.*;

@SuppressWarnings("ALL")
public class displayByType {

  public static void displayByType (List<Product> products, String type) {
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
                    if(product.type.equals(type)) {
                        System.out.println(product);
                    }
                    break;
                case "Meat":
                    if(product.type.equals(type)) {
                        System.out.println(product);
                    }
                    break;
            }
        }
    }

  public static void displayByIndex (List<Product> products, int index) {
          System.out.println(products.get(index));
      }
  }


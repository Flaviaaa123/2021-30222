package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ShopService {

    public static void main(String[] args) {
        ArrayList<Category> categories = new ArrayList<Category>();
        ArrayList<Product> products = new ArrayList<Product>();
        categories.add(new Category("Lactate",3));
        categories.add(new Category("Bauturi",4));
        categories.add(new Category("Mancare",3));
        products.add(new Product("Lapte",10,"Lactate",2));
        products.add(new Product("Sunca",24,"Mancare",6));
        products.add(new Product("Iaurt",70,"Lactate",4));
        products.add(new Product("Coca-Cola",6,"Bauturi",4));
        products.add(new Product("Sprite",12,"Bauturi",4));
        products.add(new Product("Pizza",32,"Mancare",12));

    }
}

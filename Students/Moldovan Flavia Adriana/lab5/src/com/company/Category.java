package com.company;

public class Category {
    private String name;
    private int nrOfProducts;

    public Category(String name, int nrOfProducts) {
       this.setName(name);
       this.setNrOfProducts(nrOfProducts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfProducts() {
        return nrOfProducts;
    }

    public void setNrOfProducts(int nrOfProducts) {
        this.nrOfProducts = nrOfProducts;
    }
}


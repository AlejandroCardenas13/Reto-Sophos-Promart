package com.sophos.promart.models;

public class Product {
    private String name;
    private String price;

    public Product() {
        this.name = "";
        this.price = "";
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + name + '\'' +
                ", Price='" + price + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}

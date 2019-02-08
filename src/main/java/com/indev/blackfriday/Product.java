package com.indev.blackfriday;

public class Product {

    private int price;
    private int quantity;

    public Product(){}

    public Product(int quantity, int price) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

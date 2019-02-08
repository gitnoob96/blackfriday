package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Product> capsules = new ArrayList<Product>();
    List<Product> machines = new ArrayList<Product>();

    private float total;

    private Product p = new Product();

    public float sells(String capsule) {
        float price = 0;
        if(capsule.equals("capsule")){
            Product firstCapsule = capsules.get(0);
            price = firstCapsule.getPrice();
            total += price * 5 * 0.2;
        }
        return price * 5 * 1.2f;
    }

    public void stock(int quantity, String capsule, int price) {

        if(capsule.equals("capsule")) {
            capsules.add(new Product(quantity, price));
            total += quantity * price;
        }
        else {
            machines.add(new Product(quantity, price));
            total += quantity * price;
        }

    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
       /* int total = 0;
        for(Product capsule: capsules){
            total += capsule.getQuantity() * capsule.getPrice();
        }
        for(Product machine: machines){
            total += machine.getQuantity() * machine.getPrice();
        }*/
        return (int)total;
    }

    public Company blackFriday() {
        return this;
    }
}

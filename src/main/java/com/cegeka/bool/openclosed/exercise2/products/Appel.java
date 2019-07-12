package com.cegeka.bool.openclosed.exercise2.products;

public class Appel extends Item {
    public Appel(double unitPrice, String description, int amount) {
        super(unitPrice, description, amount);
    }

    public Appel() {
        super(0.5 , "fruity snack");
    }
}

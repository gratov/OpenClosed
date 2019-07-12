package com.cegeka.bool.openclosed.exercise2.products;

public class Peer extends Item {

    public Peer(double unitPrice, String description, int amount) {
        super(unitPrice, description, amount);
    }

    public Peer() {
        super(1, "other fruity snack");
    }
}

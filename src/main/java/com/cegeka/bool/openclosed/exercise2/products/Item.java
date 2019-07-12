package com.cegeka.bool.openclosed.exercise2.products;

public class Item implements ShopItem {
    private double unitPrice;
    private String description;
    private int amount;

    public Item(double unitPrice, String description, int amount) {
        this.unitPrice = unitPrice;
        this.description = description;
        this.amount = amount;
    }

    public Item(double unitPrice, String description) {
        this.unitPrice = unitPrice;
        this.description = description;
        amount = 1;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Item setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Item setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public double getTotalItemPrice(){
        return unitPrice * amount;
    }
}

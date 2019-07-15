package com.cegeka.bool.openclosed.exercise3;

import com.cegeka.bool.openclosed.exercise3.products.Item;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    public double calculateTotalPrice(){
        double total = 0d;
        for(Item item: items){
            total += item.getUnitPrice() * item.getAmount() ;
        }
        return total;
    }

    public void addItem(Item item){
        items.add(item);
    }


}

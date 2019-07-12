package com.cegeka.bool.openclosed.exercise2;

import com.cegeka.bool.openclosed.exercise2.products.Item;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    public double calculateTotalPrice(){
        return items.stream()
                    .mapToDouble(Item::getTotalItemPrice)
                    .reduce(Double::sum)
                    .getAsDouble();
    }

    public void addItem(Item item){
        items.add(item);
    }


}

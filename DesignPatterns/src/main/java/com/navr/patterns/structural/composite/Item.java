package com.navr.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Item extends Part {
    List<Part> parts = new ArrayList<>();

    public Item(String name) {
        super(name, 0);
    }

    public Item addPart(Part part) {
        parts.add(part);
        System.out.printf("%s: Added new part %s to the item. partPrice=%d%n",
                this.getName(), part.getName(), part.getPrice());
        return this;
    }

    public int getPrice() {
        int itemPrice = 0;
        if (!parts.isEmpty()) {
            for (Part part : parts) {
                itemPrice += part.getPrice();
            }
        }
        return itemPrice;
    }
}

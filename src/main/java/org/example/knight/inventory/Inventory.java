package org.example.knight.inventory;

public abstract class Inventory implements Cloneable {
    float price;

    public Inventory(float price){
        this.price = price;
    }

    public void setPrice(float price){
    this.price = price;
    }
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }

}

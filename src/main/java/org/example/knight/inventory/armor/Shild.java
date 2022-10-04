package org.example.knight.inventory.armor;

import org.example.Shop;

public class Shild extends Armor implements IArmor{

    public Shild(){
        super(0,0);

    }

    public Shild(int armor, float price) {
        super(armor, price);
    }

    public Shild(Shild shild){
        super(shild.armor, shild.getPrice());

    }
    @Override
    public int defend(int damage) {
        return 0;
    }

    @Override
    public String toString() {
        return "Щит "+super.toString();
    }
}

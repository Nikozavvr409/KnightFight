package org.example.knight.inventory.armor;

public class Kerasa extends Armor implements IArmor{

    public Kerasa(){
        super(0,0);

    }

    public Kerasa(int armor, float price) {
        super(armor, price);
    }

    public Kerasa(Kerasa kerasa){
        super(kerasa.armor, kerasa.getPrice());

    }
    @Override
    public int defend(int damage) {
        return 0;
    }

    @Override
    public String toString() {
        return "Доспех "+super.toString();
    }
}

package org.example.knight;

import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.armor.IArmor;
import org.example.knight.inventory.weapon.IWeapon;

import java.util.ArrayList;

public class Knight implements IArmor, IWeapon {
    String name;
    int health;
    float money;
    final int sizeBack = 6;

    ArrayList<Inventory> inventories;
//    Inventory[] inventories;
    int count;

    public Knight(String name, int health, float money){
        this.health = health;
        this.money = money;
        this.name = name;

        inventories = new ArrayList<>();
        count = 0;
    }

    public boolean canBuy(Inventory inventory){
        return money >= inventory.getPrice();
    }
    public void buy(Inventory inventory){
        if (canBuy(inventory)){
            if (inventories.size()<sizeBack){
                inventories.add(inventory);
                money -= inventory.getPrice();
            }
        }
    }


//    public void buy(Inventory inventory){
//        if(count<inventories.length){
//            if(money>= inventory.getPrice()){
//                inventories[count++] = inventory;
//                this.money-=inventory.getPrice();
//            }else{
//                throw new MyException();
//            }
//        }else{
//            throw new BagException();
//        }
//    }
    @Override
    public int defend(int damage) {

        return 0;
    }

    @Override
    public int damage() {
        return 0;
    }
}

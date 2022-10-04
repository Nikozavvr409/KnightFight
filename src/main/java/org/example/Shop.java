package org.example;

import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.InventoryBuilder;
import org.example.knight.inventory.armor.Armor;
import org.example.knight.inventory.armor.Helmet;
import org.example.knight.inventory.armor.Kerasa;
import org.example.knight.inventory.armor.Shild;
import org.example.knight.inventory.weapon.Axe;
import org.example.knight.inventory.weapon.Spear;
import org.example.knight.inventory.weapon.Sword;
import org.example.knight.inventory.weapon.Weapon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shop {
    //Inventory[] inventories;
    ArrayList<Inventory> inv;
    ArrayList<Inventory> inventoriesShop;

    public Shop(){
        inventoriesShop = new ArrayList<>();
        inventoriesShop.add(new Helmet());
        inventoriesShop.add(new Kerasa());
        inventoriesShop.add(new Shild());
        inventoriesShop.add(new Axe());
        inventoriesShop.add(new Spear());
        inventoriesShop.add(new Sword());

        inv = new ArrayList<>(Arrays.asList(generateRandomInventory()));
//        inventories = generateRandomInventory();


    }
    private Inventory[] generateRandomInventory(){
        Inventory[] inventories1 = new Inventory[6];
        Random random = new Random();
        for(int i = 0; i<6; i++){
            Inventory inventory = inventoriesShop.get(random.nextInt(5));
            InventoryBuilder builder = new InventoryBuilder(inventory);
            inventories1[i] = builder.build();
        }
        return inventories1;
    }
    public Inventory getProduct(int i){
        if(inv.get(i)!=null){
            Inventory inventory = inv.get(i); //new InventoryBuilder(inv.get(i)).clone();
            //inv.remove(i);
            return inventory;
        }
        throw new RuntimeException("Нет такого товара");
    }

    public void verificationBuy(boolean b, int i){
        if (b){
            inv.remove(i);
        }
    }

//    private Inventory[] generateRandomInventory(){
//        Inventory[] inventories1 = new Inventory[6];
//        Random random = new Random();
//        for(int i = 0; i<6; i++){
//        Inventory inventory = inventoriesShop.get(random.nextInt(5));
//            InventoryBuilder builder = new InventoryBuilder(inventory);
//        inventories1[i] = builder.build();
//        }
//        return inventories1;
//    }


//    private Inventory getCompleteInventory(Inventory inventory) {
//        if (inventory instanceof Armor) {
//            Armor armor = (Armor) inventory;
//            armor.calcArmor();
//            armor.calcPrice();
//            System.out.println(armor.toString());
//        } else if (inventory instanceof Sword) {
//            Sword sword = (Sword) inventory;
//            sword.calcDamage();
//            sword.calcPrice();
//            sword.setName("Гладиус");
//            System.out.println(sword.toString());
//        } else if (inventory instanceof Weapon) {
//            Weapon weapon = (Weapon) inventory;
//            weapon.calcDamage();
//            weapon.calcPrice();
//            System.out.println(weapon.toString());
//        }
//        return inventory;
//    }
//    public Inventory getProduct(int i){
//        if(inventories[i]!=null){
//            Inventory inventory = new InventoryBuilder(inventories[i]).build();
//            inventories[i] = null;
//            //todo
//            return inventory;
//        }
//        throw new RuntimeException("Нет такого товара");
//    }


    public void printProducts(){
        for (Inventory inventory:inv) {
            System.out.println(inventory.toString());
        }
    }
}

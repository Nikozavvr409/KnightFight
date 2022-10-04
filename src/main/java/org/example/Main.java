package org.example;

import org.example.knight.BagException;
import org.example.knight.Knight;
import org.example.knight.MyException;
import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.weapon.Sword;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
//        System.out.println("print\n");
//        shop.printProducts();
//        Inventory inventory = shop.getProduct(3);
//        System.out.println("get inventory" + inventory.toString());
//        shop.printProducts();
        Knight knight1 = new Knight("Рыцарь1", 100, 100);
        for(int i = 0;i< shop.inv.size();i++){
            knight1.buy(shop.inv.get(i));
        }
        System.out.println();
    }
}
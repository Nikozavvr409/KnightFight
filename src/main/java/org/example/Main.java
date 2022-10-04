package org.example;

import org.example.knight.BagException;
import org.example.knight.Knight;
import org.example.knight.MyException;
import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.weapon.Sword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("print\n");
        shop.printProducts();
        Inventory inventory = shop.getProduct(3);
        System.out.println("get inventory" + inventory.toString());
        shop.printProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите товар от 1-го до 6-ти");

        Knight knight1 = new Knight("Рыцарь1", 100, 100);

    }
}
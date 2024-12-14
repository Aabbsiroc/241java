package main.java.lab5.task8;

import java.util.Objects;
import java.util.Random;

public class ShopItem {
    private int price;
    private String name;
    private int articule;
    private int shop = 4;
    Random random = new Random();


    public ShopItem(String name) {
        this.name = name;
        this.price = random.nextInt(1000);
        this.articule = random.nextInt(200);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ShopItem shopItem = (ShopItem) obj;  // Приведение типа
        return articule == shopItem.articule && name.equals(shopItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name  + " цена: " + price  + " № товара: " + articule +
                " № магазина: " + shop;
    }

    public Integer getArticule() {
        return articule;
    }

    public Integer getPrice() {
        return price;
    }
}


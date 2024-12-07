package main.java.lab3;

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("mag", 80, 0, 0, 30, 5, 5);
        Warrior warrior = new Warrior("warrior", 100, 0, 0, 20, 20, 1);
        Tank tank = new Tank("tank", 100, 0, 0, 15, 20, 1, 15);
        Priest priest = new Priest("priest", 80, 0, 0, 20, 5, 10);
        mage.move(13,11);
        warrior.move(12,11);
        mage.castSpell(warrior);
        warrior.attack(mage);
        warrior.attack(mage);
        mage.castSpell(warrior);
        priest.heal(mage);
        priest.move(11, 10);
        priest.heal(mage);
        System.out.println(tank);
    }
}
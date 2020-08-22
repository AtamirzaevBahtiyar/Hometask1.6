package com.company;

public class Main {

    public static void main(String[] args) {

        Boss testBoss = new Boss();

        testBoss.setHealth(500);
        testBoss.setDamage(50);


        Weapon gun = new Weapon();
        gun.setNameOfGun("AWM");
        gun.setTypeOfGun("Sniper");
        testBoss.setWeapon(gun);

        System.out.println("Boss info: " + testBoss.info());

    }
}

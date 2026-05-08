package com.narxoz.rpg;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.ChronomancerEngine;
import com.narxoz.rpg.vault.VaultRunResult;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Homework 9: Visitor + Memento ===");

        Inventory inventory = new Inventory();

        inventory.addArtifact(
                new Weapon("Dragon Sword", 150, 5, 20)
        );

        inventory.addArtifact(
                new Potion("Healing Potion", 50, 1, 30)
        );

        inventory.addArtifact(
                new Scroll("Ancient Scroll", 80, 1, "Fireball")
        );

        inventory.addArtifact(
                new Ring("Ring of Wisdom", 120, 1, 10)
        );

        inventory.addArtifact(
                new Armor("Knight Armor", 200, 10, 25)
        );

        Hero knight = new Hero(
                "Knight",
                120,
                40,
                15
        );

        knight.setInventory(inventory);

        Hero mage = new Hero(
                "Mage",
                80,
                100,
                5
        );

        mage.setInventory(inventory);

        ChronomancerEngine engine = new ChronomancerEngine();

        VaultRunResult result =
                engine.runVault(List.of(knight, mage));

        System.out.println("\n=== FINAL RESULT ===");
        System.out.println(result);
    }
}
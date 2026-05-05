package com.narxoz.rpg.vault;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.memento.Caretaker;

import java.util.List;

public class ChronomancerEngine {
    public VaultRunResult runVault(List<Hero> party) {
        int appraised = 0;
        int saved = 0;
        int restored = 0;
        for (Hero hero : party) {
            System.out.println("\n=== HERO: " + hero.getName() + " ===");
            System.out.println("Before: " + hero);

            Caretaker caretaker = new Caretaker();

            caretaker.save(hero.createMemento());
            saved++;

            hero.takeDamage(30);
            hero.addGold(50);

            System.out.println("After damage: " + hero);
            hero.restoreFromMemento(caretaker.undo());
            restored++;

            System.out.println("After rewind: " + hero);

            System.out.println("\n--- APPRAISAL ---");

            Inventory inv = hero.getInventory();
            inv.accept(new GoldAppraiser());
            inv.accept(new CurseDetector());
            inv.accept(new EnchantmentScanner());
            inv.accept(new WeightCalculator());
            appraised += inv.size();
        }
        return new VaultRunResult(appraised, saved, restored);
    }
}
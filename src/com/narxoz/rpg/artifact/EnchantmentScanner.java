package com.narxoz.rpg.artifact;

public class EnchantmentScanner implements ArtifactVisitor {

    public void visit(Weapon w) {
        System.out.println("✨ Weapon enchant: +" + w.getAttackBonus());
    }

    public void visit(Potion p) {
        System.out.println("✨ Potion heals: " + p.getHealing());
    }

    public void visit(Scroll s) {
        System.out.println("✨ Scroll spell: " + s.getSpellName());
    }

    public void visit(Ring r) {
        System.out.println("✨ Ring magic: +" + r.getMagicBonus());
    }

    public void visit(Armor a) {
        System.out.println("✨ Armor defense: +" + a.getDefenseBonus());
    }
}
package com.narxoz.rpg.artifact;

public class WeightCalculator implements ArtifactVisitor {

    public void visit(Weapon w) {
        System.out.println("⚖️ Weapon weight: " + w.getWeight());
    }

    public void visit(Potion p) {
        System.out.println("⚖️ Potion weight: " + p.getWeight());
    }

    public void visit(Scroll s) {
        System.out.println("⚖️ Scroll weight: " + s.getWeight());
    }

    public void visit(Ring r) {
        System.out.println("⚖️ Ring weight: " + r.getWeight());
    }

    public void visit(Armor a) {
        System.out.println("⚖️ Armor weight: " + a.getWeight());
    }
}
package com.narxoz.rpg.artifact;

public class GoldAppraiser implements ArtifactVisitor {

    @Override
    public void visit(Weapon w) {
        System.out.println("💰 Weapon " + w.getName() + ": " + w.getValue());
    }

    @Override
    public void visit(Potion p) {
        System.out.println("💰 Potion " + p.getName() + ": " + p.getValue());
    }

    @Override
    public void visit(Scroll s) {
        System.out.println("💰 Scroll " + s.getName() + ": " + s.getValue());
    }

    @Override
    public void visit(Ring r) {
        System.out.println("💰 Ring " + r.getName() + ": " + r.getValue());
    }

    @Override
    public void visit(Armor a) {
        System.out.println("💰 Armor " + a.getName() + ": " + a.getValue());
    }
}
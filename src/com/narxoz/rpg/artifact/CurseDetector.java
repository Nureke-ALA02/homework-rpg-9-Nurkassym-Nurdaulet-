package com.narxoz.rpg.artifact;

public class CurseDetector implements ArtifactVisitor {

    public void visit(Weapon w) {
        System.out.println("☠️ Weapon " + w.getName() + ": safe");
    }

    public void visit(Potion p) {
        System.out.println("☠️ Potion " + p.getName() + ": suspicious");
    }

    public void visit(Scroll s) {
        System.out.println("☠️ Scroll " + s.getName() + ": cursed!");
    }

    public void visit(Ring r) {
        System.out.println("☠️ Ring " + r.getName() + ": safe");
    }

    public void visit(Armor a) {
        System.out.println("☠️ Armor " + a.getName() + ": cursed!");
    }
}
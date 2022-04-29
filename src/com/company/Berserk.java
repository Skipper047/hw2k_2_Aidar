package com.company;

public class Berserk extends Hero implements Printable{
    private int damage;

    public int getDamage() { return damage;
    }

    public void setDamage(int damage) { this.damage = damage;
    }

    public Berserk(int heal, String name, int damage) {
        super(heal, name);
        this.damage = damage;
    }

    @Override
    public void print() {
        System.out.println("Heal Berserk: "+getHeal()+"\nName: "+getName()+
                "\ndamage"+damage);
    }
}

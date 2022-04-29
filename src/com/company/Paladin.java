package com.company;

public class Paladin extends Hero implements Printable{
    String art;

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }



    public Paladin(int heal, String name,String art) {
        super(heal, name);
        this.art=art;
    }

    @Override
    public void print() {
        System.out.println("Heal Paladin: "+getHeal()+"\nName: "+getName()+
                "\nArt: "+art);
    }
}

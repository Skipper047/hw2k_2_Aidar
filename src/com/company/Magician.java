package com.company;

public class Magician extends Hero implements Printable{
    String staff;

    public String getStaff() { return staff;
    }

    public void setStaff(String staff) { this.staff = staff;
    }

    public Magician(int heal, String name,String staff) {
        super(heal, name);
        this.staff=staff;

    }

    @Override
    public void print() {
        System.out.println("Heal Magician : "+getHeal()+"\nName: "+getName()+
                "\nStaff: "+staff);
    }
}

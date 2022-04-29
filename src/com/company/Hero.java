package com.company;

public class Hero {
    private int heal;
    private String name;
    public int getHeal() { return heal;
    }

    public void setHeal(int heal) { this.heal = heal;
    }

    public String getName() { return name;
    }

    public void setName(String name) { this.name = name;
    }



    public Hero(int heal, String name) {
        this.heal = heal;
        this.name = name;
    }
}

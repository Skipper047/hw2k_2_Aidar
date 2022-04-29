package com.company;

public class Main {

    public static void main(String[] args) {
	Hero hero[]={createObject(1),createObject(2),createObject(3)};
	for (int i = 0; i< hero.length; i++){
	    if (i< hero.length && hero[i] instanceof Printable){
	        ((Printable) hero[i]).print();
        }
    }
    }
    public static Hero createObject(int Hero){
        Berserk berserk = new Berserk(500,"Achiles",99);
        Paladin paladin = new Paladin(600,"Artur","Excalibur");
        Magician magician = new Magician(300,"Merlin","Askalon");
        switch (Hero){
            case 1:
            return berserk;
            case 2:
                return paladin;
            case 3:
                return magician;
        }
        Hero hero[] = {berserk,paladin,magician};
        return null;
    }
}

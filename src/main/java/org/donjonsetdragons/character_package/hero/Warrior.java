package org.donjonsetdragons.character_package.hero;

public class Warrior extends Hero{

    public void Warrior(String name){
        int[] warriorHp = {5, 10};
        int[] warriorAttackPoint = {5, 10};
        this.setHp(warriorHp);
        this.setAttackPoint(warriorAttackPoint);
        this.setName(name);
    }
}

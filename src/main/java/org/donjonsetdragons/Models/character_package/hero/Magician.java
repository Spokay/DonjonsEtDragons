package org.donjonsetdragons.Models.character_package.hero;

public class Magician extends Hero{

    public void Magician(String name){
        int[] magicianHp = {3, 6};
        int[] magicianAttackPoint = {8, 15};
        this.setHp(magicianHp);
        this.setAttackPoint(magicianAttackPoint);
        this.setName(name);
    }
}

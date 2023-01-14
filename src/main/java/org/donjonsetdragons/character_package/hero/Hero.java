package org.donjonsetdragons.character_package.hero;

import org.donjonsetdragons.character_package.Character;

public class Hero extends Character {
    private int[] hp;
    private int[] attackPoint;
    private String name;

    public int[] getHp() {
        return hp;
    }

    public void setHp(int[] hp) {
        this.hp = hp;
    }

    public int[] getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int[] attackPoint) {
        this.attackPoint = attackPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

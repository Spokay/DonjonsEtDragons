package org.example.character_package.enemy;

import org.example.character_package.Character;

public class Enemy extends Character {
    int hp;
    int attackPoint;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}

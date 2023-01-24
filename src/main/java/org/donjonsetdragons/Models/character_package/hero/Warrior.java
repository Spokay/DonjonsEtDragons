package org.donjonsetdragons.Models.character_package.hero;

import javafx.beans.property.SimpleIntegerProperty;

public class Warrior extends Hero{

    public Warrior(String name){
        SimpleIntegerProperty[] warriorAttackPoint = {new SimpleIntegerProperty(5), new SimpleIntegerProperty(10)};
        this.setHp(10);
        this.setAttackPoint(warriorAttackPoint);
        this.setName(name);
    }
}

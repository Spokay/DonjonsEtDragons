package org.donjonsetdragons.Models.character_package.hero;

import javafx.beans.property.SimpleIntegerProperty;

public class Magician extends Hero{

    public Magician(String name){
        SimpleIntegerProperty[] magicianAttackPoint = {new SimpleIntegerProperty(8), new SimpleIntegerProperty(15)};
        this.setHp(6);
        this.setAttackPoint(magicianAttackPoint);
        this.setName(name);
    }
}

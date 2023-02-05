package org.donjonsetdragons.Models.character_package.hero;

import javafx.beans.property.SimpleIntegerProperty;
import org.donjonsetdragons.Models.character_package.Hero;

public class Warrior extends Hero {

    public Warrior(String name){
        SimpleIntegerProperty[] warriorAttackPoint = {new SimpleIntegerProperty(5), new SimpleIntegerProperty(10)};
        this.setHp(10);
        this.setAttackPoint(warriorAttackPoint);
        this.setName(name);
        this.setImagePath("images/warrior.png");
    }
}

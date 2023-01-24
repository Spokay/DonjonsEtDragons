package org.donjonsetdragons.Models.character_package.hero;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import org.donjonsetdragons.Models.character_package.Character;

public class Hero extends Character {
    private SimpleIntegerProperty hp;
    private SimpleIntegerProperty[] attackPoint;
    private SimpleStringProperty name;

    public int getHp() {
        return hp.get();
    }

    public SimpleIntegerProperty hpProperty() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = new SimpleIntegerProperty(hp);
    }

    public SimpleIntegerProperty[] getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(SimpleIntegerProperty[] attackPoint) {
        this.attackPoint = attackPoint;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }
}

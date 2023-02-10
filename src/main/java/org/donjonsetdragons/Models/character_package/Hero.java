package org.donjonsetdragons.Models.character_package;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Hero extends Character {
    private SimpleIntegerProperty hp;
    private SimpleIntegerProperty[] attackPoint;
    private SimpleStringProperty name;
    private SimpleStringProperty imagePath;

    public String getImagePath() {
        return imagePath.get();
    }

    public SimpleStringProperty imagePathProperty() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = new SimpleStringProperty(imagePath);
    }


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

package org.donjonsetdragons.Controllers;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;
import org.donjonsetdragons.Models.character_package.hero.Hero;
import java.lang.reflect.Constructor;

public class HeroController extends Controller{

    public Hero currentHero;

    public HeroController(Label heroHpElement, Label heroAtkElement, String[] heroInfo) throws Exception {
        this.setCurrentHero(heroInfo);
        setObservableValues(heroHpElement, heroAtkElement);
    }

    public void setObservableValues(Label heroHpElement, Label heroAtkElement){
        System.out.println(heroHpElement);

//        binding HP stat
        IntegerBinding hpIntegerBinding = Bindings.createIntegerBinding(() -> this.getCurrentHero().getHp(), heroHpElement.textProperty(), this.getCurrentHero().hpProperty());
        heroHpElement.textProperty().bind(hpIntegerBinding.asString());

//        binding ATK stat
        StringBinding atkIntegerBinding = Bindings.createStringBinding(() -> {
            int min = this.getCurrentHero().getAttackPoint()[0].get();
            int max = this.getCurrentHero().getAttackPoint()[1].get();
            String str = min + " ~ " + max;
            return str;

        }, heroAtkElement.textProperty());
        heroAtkElement.textProperty().bind(atkIntegerBinding);
    }

    public Hero getCurrentHero() {
        return currentHero;
    }

    public void setCurrentHero(String[] heroInfo) throws Exception {
        Class className = Class.forName(heroInfo[0]);
        Constructor classConstructor = className.getConstructor(String.class);
        Hero instanceOfHero = (Hero) classConstructor.newInstance(heroInfo[1]);
        this.currentHero = instanceOfHero;
    }
}

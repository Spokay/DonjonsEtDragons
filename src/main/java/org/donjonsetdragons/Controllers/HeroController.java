package org.donjonsetdragons.Controllers;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.binding.StringBinding;
import javafx.scene.control.Label;
import org.donjonsetdragons.Models.character_package.hero.Hero;
import org.donjonsetdragons.utils.ApplicationUtils;

public class HeroController extends Controller{

    public Hero currentHero;

    public HeroController(Label heroNameElement, Label heroHpElement, Label heroAtkElement, String[] heroInfo) throws Exception {
        this.setCurrentHero(heroInfo);
        setObservableValues(heroNameElement, heroHpElement, heroAtkElement);
    }

    public void setObservableValues(Label heroNameElement, Label heroHpElement, Label heroAtkElement){

//        Binding HP stat
        IntegerBinding hpIntegerBinding = Bindings.createIntegerBinding(() -> this.getCurrentHero().getHp(), heroHpElement.textProperty(), this.getCurrentHero().hpProperty());
        heroHpElement.textProperty().bind(hpIntegerBinding.asString());

//        Binding ATK stat
        StringBinding atkIntegerBinding = Bindings.createStringBinding(() -> {
            int min = this.getCurrentHero().getAttackPoint()[0].get();
            int max = this.getCurrentHero().getAttackPoint()[1].get();
            String str = min + " ~ " + max;
            return str;
        }, heroAtkElement.textProperty());
        heroAtkElement.textProperty().bind(atkIntegerBinding);

//        Binding Name

        StringBinding nameStringBinding = Bindings.createStringBinding(() -> this.getCurrentHero().getName(), heroNameElement.textProperty(), this.getCurrentHero().nameProperty());
        heroNameElement.textProperty().bind(nameStringBinding);
    }

    public Hero getCurrentHero() {
        return this.currentHero;
    }

    public void setCurrentHero(String[] heroInfo) throws Exception {
        String className = "org.donjonsetdragons.Models.character_package.hero." + heroInfo[0];
        String[] strArr = new String[]{className, heroInfo[1]};
        this.currentHero = (Hero) ApplicationUtils.getInstanceForName(strArr);
    }
}

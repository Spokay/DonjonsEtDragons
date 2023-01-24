package org.donjonsetdragons.Controllers;
import javafx.scene.control.Label;
import org.donjonsetdragons.Models.character_package.hero.Hero;
import org.donjonsetdragons.Models.character_package.hero.Magician;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HeroControllerTest {

   /* @Test
    void setObservableValues() throws Exception {

        String heroType = "org.donjonsetdragons.Models.character_package.hero.Magician";
        String heroName = "michel";
        HeroController heroController = new HeroController(heroAttackPoints, heroHpPoints, new String[]{heroType, heroName});
        heroController.getCurrentHero().setHp(12);
        System.out.println(heroHpPoints.getText());
    }
*/
    @Test
    void setCurrentHero() throws Exception {
        String heroType = "org.donjonsetdragons.Models.character_package.hero.Magician";
        String heroName = "michel";
        Label heroHpPoints = new Label();
        Label heroAttackPoints = new Label();
        HeroController heroController = new HeroController(heroAttackPoints, heroHpPoints, new String[]{heroType, heroName});
        Hero heroInstance = heroController.getCurrentHero();
        assertTrue(heroInstance instanceof Magician);
    }
}
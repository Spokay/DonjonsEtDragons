package org.donjonsetdragons.Models.character_package.hero;

public class HeroData{
    private String heroType;
    private String heroName;

    public HeroData(String heroType, String heroName){
        this.heroType = heroType;
        this.heroName = heroName;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
package characters;

import observer.Observer;
import shieldStrategy.CopperShield;
import weaponStrategy.FireSword;

public class Warrior extends Character {
    public Warrior() {
        super(new FireSword(), new CopperShield());
        strength = 20;
        armor = 10;
        health = 100;
    }



    @Override
    public String getResource() {
        return weapon.toString() +" "+shield.toString() +" " + health +" " + strength+" "+ armor;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {
        for (Observer observer: villagers) {
            observer.update();
        }
    }
}

package characters;

import observer.Observer;
import shieldStrategy.NoShield;
import weaponStrategy.NoWeapon;

public class Goblin extends Character {
    public Goblin() {
        super(new NoWeapon(), new NoShield());
        strength = 5;
        armor = 0;
        health = 50;
    }

    @Override
    public String getResource() {
        return weapon.toString() +" "+shield.toString() +" " + health +" " + strength+" "+ armor;
    }

    @Override
    public void registerObserver(Observer observer) {
        villagers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        villagers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: villagers) {

        }
    }
}

package upgrades;

import characters.Character;
import observer.Observer;

public class Ring extends BaseDecorator {
    public Ring(Character character) {
        super(character);
        this.character.strength += 10;
    }

    public String getResource() {
        return character.getResource() + " Ring";
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

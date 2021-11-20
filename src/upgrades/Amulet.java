package upgrades;

import characters.Character;
import observer.Observer;

public class Amulet extends BaseDecorator {
    public Amulet(Character character) {
        super(character);
        this.character.health += 10;
    }

    public String getResource() {
        return character.getResource() + " Amulet";
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

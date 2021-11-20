package upgrades;

import characters.Character;
import shieldStrategy.NoShield;
import weaponStrategy.NoWeapon;

public abstract class BaseDecorator extends Character {
     public Character character;

     public BaseDecorator(Character character) {
         super(new NoWeapon(), new NoShield());
         this.character = character;
     }

     public String getResource() {
         return character.getResource();
     }
}

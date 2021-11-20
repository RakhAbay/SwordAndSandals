package characterStates;

import characters.Character;

public class StunnedState implements State {
    Character character;
    public StunnedState(Character character) {
        this.character = character;
    }

    @Override
    public int attack() {
        int dealtDamage = (character.strength + character.weapon.useWeapon())/2;
        return dealtDamage;
//        int dealtDamage = character.strength + character.weapon.useWeapon() - opponent.armor;
//        if (dealtDamage < 0) { dealtDamage = 0; }
//        System.out.println("Dealt " + dealtDamage + " damage");
//        opponent.health -= (dealtDamage/2);
//        System.out.println("remaining health - " + opponent.health);
//        opponent.shielding = false;
    }

    @Override
    public int guard() { // TODO
        return 1;
//        character.changeState(character.healthyState);
//        System.out.println("Guarding");
//        character.armor += character.shield.useShield();
//        character.shielding = true;
    }

    @Override
    public String toString() {
        return "Stunned";
    }
}

package characterStates;

import characters.Character;

public class HealthyState implements State {
    Character character;
    public HealthyState(Character character) {
        this.character = character;
    }

    @Override
    public int attack() {
        int dealtDamage = character.strength + character.weapon.useWeapon();
        return dealtDamage;
//        if (opponent.shielding) {
//            int dealtDamage = character.strength + character.weapon.useWeapon() - opponent.armor - opponent.shield.useShield();
//            if (dealtDamage < 0) { dealtDamage = 0; }
//            System.out.println("Dealt " + dealtDamage + " damage");
//            opponent.health -= dealtDamage;
//            if (opponent.health < 20) {
//                opponent.changeState(opponent.stunnedState);
//            }
//            opponent.armor -= opponent.shield.useShield();
//            System.out.println("remaining health - " + opponent.health);
//            opponent.shielding = false;
//        } else {
//            int dealtDamage = character.strength + character.weapon.useWeapon() - opponent.armor;
//            if (dealtDamage < 0) { dealtDamage = 0; }
//            System.out.println("Dealt " + dealtDamage + " damage");
//            opponent.health -= dealtDamage;
//            if (opponent.health < 20) {
//                opponent.changeState(opponent.stunnedState);
//            }
//            System.out.println("remaining health - " + opponent.health);
//        }

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
        return "Healthy";
    }
}

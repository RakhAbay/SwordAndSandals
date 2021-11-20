package characters;

import observer.Observer;
import observer.Subject;
import shieldStrategy.ShieldStrategy;
import characterStates.HealthyState;
import characterStates.State;
import characterStates.StunnedState;
import weaponStrategy.WeaponStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Character implements Subject {

    public Character(WeaponStrategy weapon, ShieldStrategy shield) {
        this.weapon = weapon;
        this.shield = shield;
        healthyState = new HealthyState(this);
        stunnedState = new StunnedState(this);
        currentState = healthyState;
        villagers = new ArrayList<>();
    }

    public int health;
    public int armor;
    public int strength;
    public WeaponStrategy weapon;
    public ShieldStrategy shield;
    //public boolean shielding = false;

    public State healthyState;
    public State stunnedState;
    public State currentState;

    public int attack() {
        return currentState.attack();
        //System.out.println("State: " +currentState);
    }
    public void guard() {
       currentState.guard();
        System.out.println("State: " +currentState);
    }

    public void changeState(State state) {
        currentState = state;
    }

    public abstract String getResource();

    List<Observer> villagers;
}

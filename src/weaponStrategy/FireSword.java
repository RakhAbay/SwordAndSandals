package weaponStrategy;

public class FireSword implements  WeaponStrategy {
    @Override
    public int useWeapon() {
        return 10;
    }

    @Override
    public String toString() {
        return "FireSword";
    }
}

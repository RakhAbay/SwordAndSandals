package weaponStrategy;

public class NoWeapon implements WeaponStrategy {
    @Override
    public int useWeapon() {
        return 0;
    }

    @Override
    public String toString() {
        return "no weapon";
    }
}

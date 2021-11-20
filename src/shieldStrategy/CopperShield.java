package shieldStrategy;

public class CopperShield implements ShieldStrategy {
    @Override
    public int useShield() {
        return 5;
    }

    @Override
    public String toString() {
        return "CopperShield";
    }
}

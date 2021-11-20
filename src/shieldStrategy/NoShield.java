package shieldStrategy;

public class NoShield implements ShieldStrategy {
    @Override
    public int useShield() {
        return 0;
    }

    @Override
    public String toString() {
        return "No Shield";
    }
}

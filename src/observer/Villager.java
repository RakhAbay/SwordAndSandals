package observer;

public class Villager implements Observer {

    int wallet = 100;

    @Override
    public void update() {
        wallet+=100;
    }

    @Override
    public String toString() {
        return ""+wallet;
    }
}

import characters.Character;
import characters.Goblin;
import characters.Warrior;
import observer.Observer;
import observer.Villager;
import upgrades.Amulet;
import upgrades.BaseDecorator;
import upgrades.Ring;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Observer villager = new Villager();
        System.out.println(villager);

        Scanner sc = new Scanner(System.in);

        System.out.println("Here your journey starts");

        int choice;

        System.out.println("Choose your character:");
        System.out.println("1) Warrior");

        choice = sc.nextInt();
        Character hero;
        while(true) {
            if (choice == 1) {
                System.out.println("Now you are a brave warrior with a fire sword and a copper shield!");
                hero = (new Warrior());
                hero.registerObserver(villager);
                break;

            }
            choice = sc.nextInt();
        }

        System.out.println(hero.getResource());

        for (int level = 1; level <= 1; level++)
        {
            System.out.println("level "+level);
            System.out.println("Your opponent is 'Goblin the Greediest'");
            Character goblin = new Goblin();
            int opponentChoice;
            Random random = new Random();

            while(true) {
                System.out.println("Your move");
                System.out.println("1) attack");
                System.out.println("2) guard");
                choice = sc.nextInt();

                while(true) {
                    if (choice == 1) {
                        System.out.println("You attack");
                        hero.attack();
                        break;
                    } else if (choice == 2) {
                        System.out.println("You guard");
                        hero.guard();
                        break;
                    }
                }
                if(goblin.health < 0) {
                    System.out.println("You defeated Goblin");
                    hero.notifyObservers();
                    System.out.println(villager);
                    break;
                }

                System.out.println("Opponent's move");
                opponentChoice = random.nextInt(2);
                opponentChoice++;
                if (opponentChoice == 1) {
                    System.out.println("Opponent attacks");
                    goblin.attack();
                } else if (opponentChoice == 2) {
                    System.out.println("Opponent guards");
                    goblin.guard();
                }
                if (hero.health < 0) {
                    System.out.println("You were defeated by Goblin and died"); break;
                }
            }
        }
        System.out.println("The end");
    }
}

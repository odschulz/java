package designpatterns.strategy;

import designpatterns.strategy.ducks.Duck;
import designpatterns.strategy.ducks.RubberDuck;
import designpatterns.strategy.ducks.YellowDuck;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new RubberDuck());
        ducks.add(new YellowDuck());

        for (Duck duck : ducks) {
            System.out.println(duck + ":");
            duck.performQuack();
            duck.performFly();
            duck.swim();
            System.out.println("-------------------------");
        }
    }

}

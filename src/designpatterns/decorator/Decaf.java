package designpatterns.decorator;

public class Decaf extends Beverage {
    public Decaf() {
        this.decription = "Decaf";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}

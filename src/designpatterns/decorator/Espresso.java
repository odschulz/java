package designpatterns.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        this.decription = "Espresso";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}

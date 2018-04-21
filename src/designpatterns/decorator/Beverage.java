package designpatterns.decorator;

public abstract class Beverage {
    String decription = "Unknown beverage";

    public String getDecription() {
        return this.decription;
    }

    public abstract double cost();
}

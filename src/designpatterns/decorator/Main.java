package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        b1 = new Cream(b1);
        b1 = new Milk(b1);

        Beverage b2 = new Decaf();
        b2 = new Milk(b2);

        System.out.println(b1.getDecription());
        System.out.println(b1.cost());
        System.out.println(b2.getDecription());
        System.out.println(b2.cost());
    }
}

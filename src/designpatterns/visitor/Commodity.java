package designpatterns.visitor;

public class Commodity {
    private double basePrice;

    Commodity(Double basePrice) {
        this.setBasePrice(basePrice);
    }

    double getBasePrice() {
        return basePrice;
    }

    private void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}

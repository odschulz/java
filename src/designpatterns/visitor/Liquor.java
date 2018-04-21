package designpatterns.visitor;

public class Liquor extends Commodity implements Visitable {

    public Liquor(Double basePrice) {
        super(basePrice);
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

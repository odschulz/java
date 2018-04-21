package designpatterns.visitor;

public class Tobacco extends Commodity implements Visitable {

    public Tobacco(Double basePrice) {
        super(basePrice);
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

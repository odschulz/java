package designpatterns.visitor;

public class Necessity extends Commodity implements Visitable {

    public Necessity(Double basePrice) {
        super(basePrice);
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

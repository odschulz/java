package designpatterns.visitor;

public class TaxVisitor implements Visitor {
    @Override
    public double visit(Liquor liquor) {
        return liquor.getBasePrice() + (liquor.getBasePrice() * .3);
    }

    @Override
    public double visit(Tobacco tobacco) {
        return tobacco.getBasePrice() + (tobacco.getBasePrice() * .2);
    }

    @Override
    public double visit(Necessity necessity) {
        return necessity.getBasePrice() + (necessity.getBasePrice() * .1);
    }
}

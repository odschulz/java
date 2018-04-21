package designpatterns.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Visitor taxVisitor = new TaxVisitor();
        Necessity necessity = new Necessity(2.00);
        System.out.println(necessity.accept(taxVisitor));
        Liquor liquor = new Liquor(2.00);
        System.out.println(liquor.accept(taxVisitor));
        Tobacco tobacco = new Tobacco(2.00);
        System.out.println(tobacco.accept(taxVisitor));
    }
}

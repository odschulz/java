package designpatterns.abstract_factory;

public class EnginolaToolkit extends AbstractFactory {
    @Override
    public CPU getCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU getMMU() {
        return new EnginolaMMU();
    }
}

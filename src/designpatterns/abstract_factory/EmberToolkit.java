package designpatterns.abstract_factory;

public class EmberToolkit extends AbstractFactory {
    @Override
    public CPU getCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU getMMU() {
        return new EmberMMU();
    }
}

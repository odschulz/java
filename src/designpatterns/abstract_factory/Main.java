package designpatterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
        CPU cpu = factory.getCPU();
        System.out.println(cpu.getName());
    }
}

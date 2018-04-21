package designpatterns.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractAlgorithm first = new FirstImplementation();
        AbstractAlgorithm second = new SecondImplementation();

        first.algorithm();
        System.out.println("-------------------------");
        second.algorithm();
    }
}

package designpatterns.template_method;

public abstract class AbstractAlgorithm {
    public void algorithm() {
        this.stepOne();
        this.stepTwo();
        this.stepThree();
    }

    public void stepOne() {
        System.out.println("Step one completed.");
    }

    public abstract void stepTwo();

    public void stepThree() {
        System.out.println("Step three completed.");
    }
}

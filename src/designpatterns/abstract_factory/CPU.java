package designpatterns.abstract_factory;

public abstract class CPU {
    private String name;

    public CPU(String name) {
        this.setName(name);;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}

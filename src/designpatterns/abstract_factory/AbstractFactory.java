package designpatterns.abstract_factory;

public abstract class AbstractFactory {
    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;
        switch (architecture) {
            case EMBER:
                factory = EMBER_TOOLKIT;
                break;
            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
            default:
                break;
        }

        return factory;
    }

    public abstract CPU getCPU();
    public abstract MMU getMMU();

}

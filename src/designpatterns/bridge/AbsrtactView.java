package designpatterns.bridge;

/**
 * This is an abstraction that will represent numerous ways to work with each
 * resource. Methods can be completely different than the ones in the resource
 * abstraction.
 */
public abstract class AbsrtactView {

    public IResource resource;

    public AbsrtactView(IResource resource) {
        this.resource = resource;
    }

    public abstract String show();
}

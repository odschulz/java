package designpatterns.bridge;

public class DetailedView extends AbsrtactView {

    public DetailedView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return "Detailed: " + this.resource.getTitle()
                + ", "
                + this.resource.getBody();
    }
}

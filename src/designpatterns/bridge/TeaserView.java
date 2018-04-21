package designpatterns.bridge;

public class TeaserView extends AbsrtactView {

    public TeaserView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return "Teaser: " + this.resource.getTitle();
    }
}

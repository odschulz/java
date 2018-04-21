package designpatterns.composite;

public class File extends FileSystem {

    public File(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(this.getIndent() + this.getName());
    }
}

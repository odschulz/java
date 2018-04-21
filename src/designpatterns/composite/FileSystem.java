package designpatterns.composite;

public abstract class FileSystem {
    private String name;
    private static StringBuilder indentBuilder = new StringBuilder();

    public FileSystem(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void addIndent() {
        indentBuilder.append("-");
    }

    String getIndent() {
        return indentBuilder.toString();
    }

    void resetIndet() {
        indentBuilder.setLength(0);
    }

    public abstract void ls();
}

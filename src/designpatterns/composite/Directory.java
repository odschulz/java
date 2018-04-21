package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem {
    private List<FileSystem> fileSystemItems;

    public Directory(String name) {
        super(name);
        this.fileSystemItems = new ArrayList<>();
    }

    public void addFileSystemItems(FileSystem item) {
        this.fileSystemItems.add(item);
    }

    @Override
    public void ls() {
        System.out.println(this.getIndent() + this.getName());
        this.addIndent();
        for (FileSystem fileSystemItem : fileSystemItems) {
            fileSystemItem.ls();
        }
    }
}

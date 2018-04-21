package designpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Directory dir1 = new Directory("dir_1");
        Directory dir11 = new Directory("dir_1_1");
        Directory dir12 = new Directory("dir_1_2");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        dir1.addFileSystemItems(file1);
        dir1.addFileSystemItems(file2);
        dir1.addFileSystemItems(dir11);
        dir1.addFileSystemItems(dir12);
        dir11.addFileSystemItems(file3);

        dir1.ls();
    }
}

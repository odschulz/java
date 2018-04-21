package designpatterns.bridge;

public class Book {
    public String title;
    public String author;
    public String summary;

    public Book(String title, String author, String summary) {
        this.title = title;
        this.author = author;
        this.summary = summary;
    }
}

package designpatterns.bridge;

public class BookResource implements IResource {
    public Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        return this.book.title + " by " + this.book.author;
    }

    @Override
    public String getBody() {
        return this.book.summary;
    }
}

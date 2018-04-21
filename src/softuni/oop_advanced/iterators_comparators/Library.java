package softuni.oop_advanced.iterators_comparators;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator iterator() {
        return new BookIterator();
    }

    private final class BookIterator implements Iterator<Book> {

        private int index;

        public BookIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }

        @Override
        public Book next() {
            return books[this.index++];
        }
    }
}

package softuni.oop_advanced.iterators_comparators;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library(
                new Book[]{
                        new Book("Book1"),
                        new Book("Book2")
                });

        for (Book book : lib) {
            System.out.println(book);
        }
    }
}

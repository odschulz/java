package designpatterns.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Decouple an abstraction from its implementation so that the two can vary
 * independently.
 *
 * With the Bridge Design Pattern you create 2 layers of abstraction
 * In this example there is an abstract class representing
 * different types of views and an interface that will represent resources that
 * can have their data displayed by views.
 * This allows to use an infinite variety of devices and remotes
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author1", "Summary1");
        Album album1 = new Album("Performer1", "Album1", "Song1, Song2");
        IResource bookResource1 = new BookResource(book1);
        IResource albumResource1 = new AlbumResource(album1);

        List<AbsrtactView> views = new ArrayList<>();
        views.add(new TeaserView(bookResource1));
        views.add(new DetailedView(bookResource1));
        views.add(new TeaserView(albumResource1));
        views.add(new DetailedView(albumResource1));

        for (AbsrtactView view : views) {
            System.out.println(view.show());
        }

    }
}

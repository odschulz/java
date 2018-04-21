package softuni.oop_advanced.generics.lab.a_jar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    /**
     * Stack of elements.
     */
    private Deque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        this.elements.push(element);
    }

    public T remove() {
        return this.elements.pop();
    }
}

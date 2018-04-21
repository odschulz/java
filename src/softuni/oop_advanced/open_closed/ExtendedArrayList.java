package softuni.oop_advanced.open_closed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;

public class ExtendedArrayList<T extends Comparable<? super T>> extends ArrayList<T> {
    T getMin() {
        BiFunction<T, T, Boolean> func = (next, current) -> next.compareTo(current) < 0;
        return getElementByComparison(func);
    }

    T getMax() {
        BiFunction<T, T, Boolean> func = (next, current) -> next.compareTo(current) > 0;
        return getElementByComparison(func);
    }

    private T getElementByComparison(BiFunction<T, T, Boolean> biFunc) {
        T current = null;
        Iterator<T> iterator = super.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (current == null || biFunc.apply(next, current)) {
                current = next;
            }
        }

        return current;
    }

    public static void main(String[] args) {
        ExtendedArrayList<Integer> l = new ExtendedArrayList<>();
        l.add(0);
        l.add(10);
        l.add(-10);
        l.add(1000);
        l.add(5);

        System.out.println(l.getMin());
        System.out.println(l.getMax());
    }

}

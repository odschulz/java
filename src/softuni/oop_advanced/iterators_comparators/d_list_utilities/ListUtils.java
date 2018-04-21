package softuni.oop_advanced.iterators_comparators.d_list_utilities;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> T getMin(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        T minItem = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(minItem) < 0) {
                minItem = list.get(i);
            }
        }

        return minItem;
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> T getMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        T maxItem = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(maxItem) > 0) {
                maxItem = list.get(i);
            }
        }

        return maxItem;
    }

    public static <T> List<Integer> getNullIndices(List<T> list) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                indices.add(i);
            }
        }

        return indices;
    }

    /**
     * Flatten 2d list. Source should extend T while destination shoul be
     * T at minimum.
     */
    public static <T> void flatten(List<? super T> dest, List<List<? extends T>> src) {
        for (List<? extends T> inner : src) {
            dest.addAll(inner);
        }
    }

}

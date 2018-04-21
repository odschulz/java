package softuni.oop_advanced.iterators_comparators.d_list_utilities;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 2, 1, 3);
//        System.out.println(ListUtils.getMin(list));
//        System.out.println(ListUtils.getMax(list));
//
//        List<String> test = Arrays.asList(null, "Córdoba", null);
//        System.out.println(ListUtils.getNullIndices(test));

        // Wildcard example.
        List<? extends Number> wildcardList = new ArrayList<>();

        // Anything above Number would be
        // List<? super Number> wildcardList2 = new ArrayList<>();

        List<Integer> intArr = new ArrayList<>();
        List<String> strArr = new ArrayList<>();
        wildcardList = intArr;
        // @code wildcardList = strArr; @endcode will not work
    }

}

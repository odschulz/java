package data_structures.heaps_n_priority_queues;

import java.util.Collections;

public class Heap<E> {

    public static <E extends Comparable<E>> void sort(E[] array) {
        createHeap(array);
        heapSort(array);
    }

    public static <E extends Comparable<E>> void createHeap(E[] array) {
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            heapifyDown(array, i, array.length - 1);
        }
    }

    private static <E extends Comparable<E>> void heapifyDown(E[] array, int currentElementIndex, int end) {
        int childIndex = (currentElementIndex * 2) + 1;
        if (childIndex > end) {
            return;
        }

        if (childIndex + 1 <= end &&
                array[childIndex + 1].compareTo(array[childIndex]) > 0 ) {
            childIndex += 1;
        }

        if (childIndex <= end &&  array[childIndex].compareTo(array[currentElementIndex]) > 0) {
            swap(array, childIndex, currentElementIndex);
            heapifyDown(array, childIndex, end);
        }
    }

    private static <E extends Comparable<E>> void heapSort(E[] heap) {
        for (int i = heap.length - 1; i >= 1; i--) {
            swap(heap, 0, i);
            heapifyDown(heap, 0, i - 1);
        }

    }

    private static <E> void  swap(E[] array, int leftIndex, int rightIndex) {
        E temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }


}

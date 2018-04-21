package data_structures.heaps_n_priority_queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class BinaryHeap<T extends Comparable<T>> {

    private List<T> heap;

    public BinaryHeap() {
        this.heap = new ArrayList<>();
    }

    public int size() {
        return this.heap.size();
    }

    public void insert(T element) {
        this.heap.add(element);
        this.heapifyUp(this.size() - 1);
    }

    public T peek() {
        if (this.size() == 0) {
            throw new NoSuchElementException("Heap is empty.");
        }
        return this.heap.get(0);
    }

    public T pull() {
        if (this.size() == 0) {
            throw new NoSuchElementException("Heap is empty.");
        }
        T pulledElement = this.heap.get(0);
        this.heap.set(0, this.heap.get(this.size() - 1));
        this.heap.remove(this.size() - 1);
        this.heapifyDown(0);

        return pulledElement;
    }

    private void heapifyDown(int currentElementIndex) {
        int childIndex = (currentElementIndex * 2) + 1;
        if (childIndex >= this.size()) {
            return;
        }

        if (childIndex + 1 < this.size() &&
                this.heap.get(childIndex + 1).compareTo(this.heap.get(childIndex)) > 0 ) {
            childIndex += 1;
        }

        if (childIndex < this.size() &&  this.heap.get(childIndex).compareTo(this.heap.get(currentElementIndex)) > 0) {
            Collections.swap(this.heap, childIndex, currentElementIndex);
            this.heapifyDown(childIndex);
        }
    }

    private void heapifyUp(int currentElementIndex) {
        int parentIndex = (currentElementIndex - 1) / 2;
        if (parentIndex >= 0) {
            if (this.heap.get(parentIndex).compareTo(this.heap.get(currentElementIndex)) < 0) {
                Collections.swap(this.heap, currentElementIndex, parentIndex);
                this.heapifyUp(parentIndex);
            }
        }
    }

}

package algorithms.topological_sort;

import data_structures.directed_weighted_graph.DWGraph;
import data_structures.directed_weighted_graph.Edge;

import java.util.*;

public class TopologicalSort<T, E extends Edge<T>> extends DWGraph<T, E> {

    public Deque<T> topologicalSort() {
        Deque<T> stack = new ArrayDeque<>();
        Map<T, Boolean> visited = new HashMap<>();
        Map<T, Boolean> isBeingProcessed = new HashMap<>();

        // Could be avoided.
        for (T vertex : this.getVertices().keySet()) {
            visited.put(vertex, false);
            isBeingProcessed.put(vertex, false);
        }

        for (T v : this.getVertices().keySet()) {
            if (!visited.get(v)) {
                topologicalSortUtil(v, visited, isBeingProcessed, stack);
            }
        }

        return stack;
    }

    private void topologicalSortUtil(
            T vertex,
            Map<T, Boolean> visited,
            Map<T, Boolean> isBeingProcessed,
            Deque<T> stack
    ) throws  UnsupportedOperationException {

        visited.put(vertex, true);
        isBeingProcessed.put(vertex, true);
        for (E e : this.getVertices().get(vertex)) {
            T nextChild = e.getDestination();
            if (isBeingProcessed.get(nextChild)) {
                throw  new UnsupportedOperationException("Trying to perform topological sort on a cyclic graph.");
            }
            if (!visited.get(nextChild)) {
                this.topologicalSortUtil(nextChild, visited, isBeingProcessed, stack);
            }
        }
        isBeingProcessed.put(vertex, false);

        stack.push(vertex);
    }

}

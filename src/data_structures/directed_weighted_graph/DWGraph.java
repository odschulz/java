package data_structures.directed_weighted_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DWGraph<T, E extends Edge<T>> {
    final private Map<T, List<E>> vertices;

    public DWGraph() {
        this.vertices = new HashMap<>();
    }

    public Map<T, List<E>> getVertices() {
        return this.vertices;
    }

    public void addVertix(T v) {
        if (this.vertices.containsKey(v)) {
            throw new IllegalArgumentException("Vertix already containe.");
        }

        this.vertices.put(v, new ArrayList<>());
    }

    public void addEdge(T start, E edge) {
        if (!this.vertices.containsKey(start) || !this.vertices.containsKey(edge.getDestination())) {
            throw new IllegalArgumentException("Trying to add an edge for non-contained vertix.");
        }

        this.vertices.get(start).add(edge);
    }

    public boolean areConnected(T start, T destination) {
        if (!this.vertices.containsKey(start) || !this.vertices.containsKey(destination)) {
            throw new IllegalArgumentException("Passed vertices not contained.");
        }

        for (Edge<T> startEdge : this.vertices.get(start)) {
            if (startEdge.getDestination().equals(destination)) {
                return true;
            }
        }

        return false;
    }

    public void removeEdge(T start, T destination) {
        // @todo:
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<T, List<E>> entry : vertices.entrySet()) {
            sb.append("{ ");
            sb.append(entry.getKey());
            sb.append(" => [ ");
            sb.append(entry.getValue().stream()
                    .map(Edge::toString)
                    .collect(Collectors.joining(", "))
            );
            sb.append(" ] }");
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}

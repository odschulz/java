package data_structures.directed_weighted_graph;

public class Edge<T> {
    private T destination;

    public Edge(T destination) {
        this.destination = destination;

    }

    public T getDestination() {
        return this.destination;
    }

    @Override
    public String toString() {
        return this.getDestination().toString();
    }
}

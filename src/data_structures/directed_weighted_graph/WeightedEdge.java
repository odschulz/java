package data_structures.directed_weighted_graph;

public class WeightedEdge<T> extends Edge<T> {
    private double weight;
    public WeightedEdge(T destination, double weight) {
        super(destination);
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "(v: " + this.getDestination() + ", w: " + this.getWeight() + ")";
    }

}

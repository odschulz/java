package data_structures.directed_weighted_graph;

public class Main {
    public static void main(String[] args) {
        DWGraph<Integer, WeightedEdge<Integer>> g = new DWGraph<>();
        g.addVertix(1);
        g.addVertix(2);
        g.addVertix(3);
        g.addVertix(4);
        g.addVertix(5);
        g.addVertix(6);

        g.addEdge(1, new WeightedEdge<Integer>(2, 10));
        g.addEdge(1, new WeightedEdge<Integer>(3, 14));

        System.out.println(g.areConnected(1, 2));
        System.out.println(g);
    }
}

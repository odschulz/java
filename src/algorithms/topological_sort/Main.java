package algorithms.topological_sort;

import data_structures.directed_weighted_graph.Edge;

import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        // @see directed_acyclic_graph.png
        TopologicalSort<String, Edge<String>> g = new TopologicalSort<>();
        g.addVertix("A");
        g.addVertix("B");
        g.addVertix("C");
        g.addVertix("D");
        g.addVertix("E");

        g.addEdge("A", new Edge<String>("B"));
        g.addEdge("A", new Edge<String>("D"));
        g.addEdge("B", new Edge<String>("E"));
        g.addEdge("C", new Edge<String>("A"));
        g.addEdge("C", new Edge<String>("D"));
        g.addEdge("D", new Edge<String>("B"));
        g.addEdge("D", new Edge<String>("E"));

        // This makes it cyclic and should throw an exception.
//        g.addEdge("D", new Edge<String>("C"));

        Deque<String> stack = g.topologicalSort();
        for (String s : stack) {
            System.out.print(s);
        }
    }
}

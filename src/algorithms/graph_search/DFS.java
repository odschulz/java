package algorithms.graph_search;

import algorithms.graph_search.GraphNode;

public class DFS {
    public static void print(GraphNode node) {
        System.out.println(node.value);
        node.visited = true;
        for(GraphNode w : node.neighbors) {
            if(!w.visited) {
                print(w);
            }
        }
    }

}

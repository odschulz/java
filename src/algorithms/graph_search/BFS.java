package algorithms.graph_search;

import algorithms.graph_search.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void print(GraphNode node) {

        Queue<GraphNode> queue = new LinkedList<>();
        node.visited = true;
        queue.add(node);

        System.out.println(node.value);

        while(!queue.isEmpty()) {
            GraphNode v = queue.poll();
            for(GraphNode w : v.neighbors) {
                if(!w.visited) {
                    System.out.println(w.value);
                    w.visited = true;
                    queue.add(w);
                }
            }
        }

    }
}

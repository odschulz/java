package algorithms.graph_search;

public class GraphNode {

    public GraphNode[] neighbors;
    public int value;
    public boolean visited;

    public GraphNode(int v) {
        this.value = v;
        this.visited = false;
    }

}

package algorithms.graph_search;

public class Main {
    public static void main(String[] args) {
        GraphNode n0 = new GraphNode(0);
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);
        GraphNode n5 = new GraphNode(5);
        GraphNode n6 = new GraphNode(6);
        GraphNode n7 = new GraphNode(7);
        GraphNode n8 = new GraphNode(8);

        n0.neighbors = new GraphNode[] {n1, n3};
        n1.neighbors = new GraphNode[] {n2, n4, n0};
        n2.neighbors = new GraphNode[] {n5, n1};
        n3.neighbors = new GraphNode[] {n4, n6, n0};
        n4.neighbors = new GraphNode[] {n5, n7, n3, n1};
        n5.neighbors = new GraphNode[] {n8, n4, n2};
        n6.neighbors = new GraphNode[] {n7, n3};
        n7.neighbors = new GraphNode[] {n8, n4, n6};
        n8.neighbors = new GraphNode[] {n7, n5};

//        BFS.print(n0);
        System.out.println("-------------------------");
        DFS.print(n0);

    }
}

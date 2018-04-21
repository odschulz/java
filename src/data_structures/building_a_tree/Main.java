package data_structures.building_a_tree;

public class Main {

    // Demonstrate how to use constructors for building the tree and includes
    // print methods.
    public static void main(String[] args) {
        Node<Integer> tree =
                new Node<Integer>(
                        1,
                        new Node<Integer>(
                                2,
                                new Node<Integer>(
                                        3,
                                        new Node<Integer>(10),
                                        new Node<Integer>(10)
                                ),
                                new Node<Integer>(
                                        4,
                                        new Node<Integer>(5)
                                )
                        ),
                        new Node<Integer>(
                                6,
                                new Node<Integer>(
                                        7),
                                new Node<Integer>(
                                        8,
                                        new Node<Integer>(5)
                                )
                        )
                );

        tree.print();
    }




}

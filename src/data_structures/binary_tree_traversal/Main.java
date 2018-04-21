package data_structures.binary_tree_traversal;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /*
                   (*)
                   / \
                 /    \
              (+)     (-)
              / \     / \
            (3) (2) (9) (6)
         */
        Node<String> root = new Node<>("*");
        root.left = new Node<>("+");
        root.right = new Node<>("-");
        root.left.left = new Node<>("3");
        root.left.right = new Node<>("2");
        root.right.left = new Node<>("9");
        root.right.right = new Node<>("6");
        Consumer<String> c = System.out::print;

        System.out.print("Pre-order: ");
        root.preOrder(c);
        System.out.println();

        System.out.print("In order: ");
        root.inOrder(c);
        System.out.println();

        System.out.print("Post-order: ");
        root.postOrder(c);

    }
}

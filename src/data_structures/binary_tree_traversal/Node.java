package data_structures.binary_tree_traversal;

import java.util.function.Consumer;

public class Node<T> {
    T value;
    Node left, right;

    public Node(T value) {
        this.value = value;
        this.left = this.right = null;
    }

    void preOrder(Consumer<T> action){
        this.preOrder(action, this);
    }

    void inOrder(Consumer<T> action){
        this.inOrder(action, this);
    }

    void postOrder(Consumer<T> action){
        this.postOrder(action, this);
    }

    private void preOrder(Consumer<T> action, Node<T> node) {
        action.accept(node.value);

        if (node.left != null) {
            this.preOrder(action, node.left);
        }


        if (node.right != null) {
            this.preOrder(action, node.right);
        }
    }

    private void inOrder(Consumer<T> action, Node<T> node){
        if (node.left != null) {
            this.inOrder(action, node.left);
        }

        action.accept(node.value);

        if (node.right != null) {
            this.inOrder(action, node.right);
        }
    }

    private void postOrder(Consumer<T> action, Node<T> node) {
        if (node.left != null) {
            this.postOrder(action, node.left);
        }

        if (node.right != null) {
            this.postOrder(action, node.right);
        }

        action.accept(node.value);
    }
}

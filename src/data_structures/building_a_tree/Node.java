package data_structures.building_a_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node<T> {
    public T value;
    public List<Node<T>> children = null;

    public Node(T value, Node<T>... children) {
        this.value = value;
        this.children = Arrays.asList(children);
    }

    public Node(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

//    public void print() {
////        print("", true);
////    }
////
////    private void print(String prefix, boolean isTail) {
////        System.out.println(prefix + (isTail ? "└── " : "├── ") + value);
////        for (int i = 0; i < children.size() - 1; i++) {
////            children.get(i).print(prefix + (isTail ? "    " : "│   "), false);
////        }
////        if (children.size() > 0) {
////            children.get(children.size() - 1)
////                    .print(prefix + (isTail ?"    " : "│   "), true);
////        }
////    }

    public void print() {
       this.print(1);
    }

    private void print(int indent) {
        System.out.print(String.format("%1$-" + indent + "s", " "));
        System.out.println(this.value);
        for (Node<T> child : this.children) {
            child.print(indent + 2);
        }
    }
}

package practice;

import java.util.ArrayList;
import java.util.List;

class NodeOfTree {
    Object data;

    NodeOfTree parent;

    List<NodeOfTree> children = new ArrayList<>();

    public NodeOfTree(Object data) {
        this.data = data;
    }

    public NodeOfTree(Object data, NodeOfTree parent) {
        this.data = data;
        this.parent = parent;
        parent.children.add(this);
    }

    public NodeOfTree(Object data, NodeOfTree parent, List<NodeOfTree> children) {
        this.data = data;
        this.parent = parent;
        this.children = children;
    }

    public String toString(){
        return this.data.toString();
    }
}

public class TreeDataStructure {


    public static void main(String[] args) {
        NodeOfTree node1 = new NodeOfTree("A");

        // children of node 1
        NodeOfTree node2 = new NodeOfTree("B", node1);
        NodeOfTree node3 = new NodeOfTree("C", node1);

        // children of node 3
        NodeOfTree node4 = new NodeOfTree("D", node3);
        NodeOfTree node5 = new NodeOfTree("F", node3);

        System.out.println(node3.children);
    }

}

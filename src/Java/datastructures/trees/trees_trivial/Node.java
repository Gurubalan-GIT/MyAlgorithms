package Java.datastructures.trees.trees_trivial;

public class Node {
    int data;
    Node left;
    Node right;
    Node parent;

    public Node(int data) {
        this.data = data;
        parent=left=right=null;
    }

    public int getData() {
        return data;
    }
}

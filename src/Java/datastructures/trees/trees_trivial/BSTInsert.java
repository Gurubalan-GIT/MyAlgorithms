package Java.datastructures.trees.trees_trivial;

public class BSTInsert {
    public static void main(String[] args){
        BST bst=new BST();
        bst.put(11);
        bst.put(2);
        bst.put(233);
        bst.put(12);
        bst.put(1);
        bst.show(bst.find(11));

    }
}

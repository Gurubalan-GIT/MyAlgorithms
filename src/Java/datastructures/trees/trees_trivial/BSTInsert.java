package Java.datastructures.trees.trees_trivial;

import static Java.datastructures.trees.trees_trivial.BST.scanner;

public class BSTInsert {
    public static void main(String[] args){
        BST bst=new BST();
        int nodes,key;
        System.out.println("Enter the number of nodes- ");
        nodes=scanner.nextInt();
        System.out.println("Enter the values- ");
        bst.insertAll(nodes);
        System.out.println("Enter which part of the subtree (value) you want to display from- ");
        key=scanner.nextInt();
        bst.show(bst.find(key));
    }
}

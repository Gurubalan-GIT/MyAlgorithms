package Java.datastructures.trees.trees_trivial;

import java.util.Scanner;

public class BST {
    private Node root;
    private int size;
    static Scanner scanner=new Scanner(System.in);
    BST(){
        root=null;
    }

    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if(key < current.data) {
                if(current.left == null)
                    return current;	//The key isn't exist, returns the parent
                current = current.left;
            } else if(key > current.data) {
                if(current.right == null)
                    return current;
                current = current.right;
            } else {	// If you find the value return it
                return current;
            }
        }
        return null;
    }

    void insertAll(int nodes){
        for(int i=1;i<=nodes;i++){
            int data = scanner.nextInt();
            insert(data);
        }
    }

    void insert(int value){
        Node newNode = new Node(value);
        if(root == null)
            root = newNode;
        else{
            //This will return the soon to be parent of the value you're inserting
            Node parent = find(value);

            //This if/else assigns the new node to be either the left or right child of the parent
            if(value < parent.data){
                parent.left = newNode;
                parent.left.parent = parent;
            }
            else{
                parent.right = newNode;
                parent.right.parent = parent;
            }
        }
        size++;
    }

    void show(Node node){
        if(node!=null){
            System.out.println(node.data);
            show(node.left);
            show(node.right);
        }
    }


}

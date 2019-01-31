package Java.datastructures.trees.trees_trivial;

public class BST {
    private Node root;
    private int size;
    BST(){
        root=null;
    }
/*
    void insert(int data){
        Node node=new Node(data);
        if(root==null){
            root=node;
        }
        Node parentNode=root;
        Node childNode=root;
        while (childNode!=null){
            parentNode=childNode;
            if(data<childNode.data){
                childNode=childNode.left;
            }else{
                childNode=childNode.right;
            }
        }
        if(data<parentNode.data){
            parentNode.left=node;
        }else{
            parentNode.right=node;
        }
    }

    Node findNode(int data){
        Node child=root;
        while(child!=null){
            if(data==child.data){
                break;
            }else{
                if(data<child.data){
                    child=child.left;
                }else{
                    child=child.right;
                }
            }
        }
        return child;
    }
*/

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

    public void put(int value){
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
                return;
            }
            else{
                parent.right = newNode;
                parent.right.parent = parent;
                return;
            }
        }
    }


    void show(Node node){
        if(node!=null){
            show(node.left);
            System.out.println(node.data);
            show(node.right);
        }
    }


}

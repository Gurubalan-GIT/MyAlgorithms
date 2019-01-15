package guru.algorithms.datastructures.linkedlist;

public class LinkedList {
    private Node head;

    public void add(int data){
        Node node=new Node(data);
        node.next=null;
        //Checking if the head is null, if it is node we have to traverse till the last node (until null) and then add it.
        if(head==null){
            head=node;
        }
        else{
            Node traversalNode = head;
            while (traversalNode.next!=null){
                traversalNode=traversalNode.next;
            }
            traversalNode.next=node;
        }
    }

    public void show(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print("-->"+currentNode.getData());
            currentNode=currentNode.next;
        }
    }
}

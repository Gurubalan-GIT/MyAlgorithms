package guru.algorithms.datastructures.linkedlist;

public class LinkedList {
    private Node head;

    public void add(int data){
        Node node=new Node(data);
        node.next=null;

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
            System.out.print("-->"+currentNode.data);
            currentNode=currentNode.next;
        }
    }
}

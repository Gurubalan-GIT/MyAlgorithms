package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.sll;

import java.util.Scanner;
/**
 * @author Gurbalan-GIT
 */
@SuppressWarnings("Duplicates")
class LinkedList {
    private Node head;
    private int size;
    static Scanner scanner=new Scanner(System.in);

    LinkedList(){
        this.size=0;
        this.head=null;
    }

    void addMultipleFirst(int nodes){
        for(int i=1;i<=nodes;i++)
        {
            int data = scanner.nextInt();
            addFirst(data);
        }
    }

    void addMultipleLast(int nodes){
        for(int i=1;i<=nodes;i++)
        {
            int data = scanner.nextInt();
            addLast(data);
        }
    }

    private void addLast(int data){
        Node node=new Node(data);
        //This step need not be done, default is null.
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
        size++;
    }

    void addAt(int index, int data){
        Node node = new Node(data);
        node.next=null;
        if(index==0){
            addFirst(data);
        }else {
            Node traversal = head;
            for (int i = 0; i < index - 1; i++) {
                traversal = traversal.next;
            }
            node.next = traversal.next;
            traversal.next = node;
        }
        size++;
    }

    private void addFirst(int data){
        Node node=new Node(data);
            node.next = head;
            head=node;
            size++;
    }

    void deleteLast(){
        Node traversalNode=head;
        for(int i=0;i<size-2;i++){
            traversalNode=traversalNode.next;
        }
        traversalNode.next=null;
    }

    void deleteFirst(){
        head=head.next;
    }

    void deleteAt(int index){
        if(index==0){
            deleteFirst();
        }else {
            Node node = head;
            Node tempNode;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            tempNode=node.next;
            node.next=tempNode.next;
        }
    }
    /*
     *@param Item
     *
     */
    void deleteItem(int data){
        if(head.getData()==data){
            deleteFirst();
        }else{
            Node node=head;
            Node tempNode=head;
            while(node!=null){
                if(node.getData()==data){
                    tempNode.next=node.next;
                    node=tempNode.next;
                }else{
                    tempNode=node;
                    node=node.next;
                }
            }
        }
    }

    void sort(){
        if (size > 1) {
            for (int i = 0; i < size; i++ ) {
                Node currentNode = head;
                Node RightNode = head.next;
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.getData() > RightNode.getData()) {
                        int temp = currentNode.getData();
                        currentNode.data = RightNode.getData();
                        RightNode.data = temp;
                    }
                    currentNode = RightNode;
                    RightNode = RightNode.next;
                }
            }
        }
    }

    void show(){
        Node currentNode=head,traverse=head;
        int lastNode=0;
        while(currentNode!=null){
            lastNode=currentNode.getData();
            currentNode=currentNode.next;
        }
        //I'm doing this so I can break when I know the last element and print with the correct pattern.
        while(traverse!=null){
            if(lastNode==traverse.getData()){
                System.out.println(traverse.getData());
                break;
            }else{
                System.out.print(traverse.getData()+"->");
                traverse=traverse.next;
            }
        }
    }

    int size(){
        return size;
    }
}

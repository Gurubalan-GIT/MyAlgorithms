package guru.algorithms.datastructures.linkedlist.linkedlist_trivial;

import java.util.Scanner;

class LinkedList {
    private Node head;
    static Scanner scanner=new Scanner(System.in);
    void addLast(int data){
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
    }

    void addFirst(int data){
        Node node=new Node(data);
            node.next = head;
            head=node;
    }

    void deleteLast(){
        Node traversalNode=head;
        for(int i=0;i<size()-2;i++){
            traversalNode=traversalNode.next;
        }
        traversalNode.next=null;
    }

    void deleteFirst(){
        head=head.next;
    }

    void deleteAt(int index){
        if(index==0){
            head=head.next;
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

    void show(){
        Node currentNode=head,traverse=head;
        int lastNode=0;
        while(currentNode!=null){
            lastNode=currentNode.getData();
            currentNode=currentNode.next;
        }
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
        int size=0;
        Node traverse=head;
        while(traverse!=null){
            traverse=traverse.next;
            size++;
        }
        return size;
    }
}

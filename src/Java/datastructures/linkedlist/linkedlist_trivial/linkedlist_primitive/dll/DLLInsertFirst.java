package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.dll;

import static Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.dll.DoublyLinkedList.scanner;

public class DLLInsertFirst {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args){
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        int nodes;
        System.out.println("Enter number of nodes-");
        nodes=scanner.nextInt();
        System.out.println("Enter the values- ");
        doublyLinkedList.addMultipleFirst(nodes);
        doublyLinkedList.show();
    }
}

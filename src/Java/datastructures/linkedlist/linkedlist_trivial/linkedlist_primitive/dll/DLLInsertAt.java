package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.dll;

import static Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.dll.DoublyLinkedList.scanner;

public class DLLInsertAt {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args){
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        int nodes,data,index;
        System.out.println("Enter number of nodes-");
        nodes=scanner.nextInt();
        System.out.println("Enter the values- ");
        doublyLinkedList.addMultipleLast(nodes);
        System.out.println("Enter the index and value to be inserted- ");
        index=scanner.nextInt();
        data=scanner.nextInt();
        doublyLinkedList.addAt(index,data);
        doublyLinkedList.show();
    }
}

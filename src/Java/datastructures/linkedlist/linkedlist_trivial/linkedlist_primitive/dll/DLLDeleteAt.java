package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.dll;

import static Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.dll.DoublyLinkedList.scanner;

public class DLLDeleteAt {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args){
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        int nodes,index;
        System.out.println("Enter number of nodes-");
        nodes=scanner.nextInt();
        System.out.println("Enter the values- ");
        doublyLinkedList.addMultipleLast(nodes);
        System.out.println("Enter the index to be deleted- ");
        index=scanner.nextInt();
        doublyLinkedList.deleteAt(index);
        doublyLinkedList.show();
    }
}

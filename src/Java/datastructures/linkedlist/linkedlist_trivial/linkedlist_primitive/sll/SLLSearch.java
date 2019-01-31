package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.sll;

import static Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.sll.LinkedList.scanner;

public class SLLSearch {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args){
        LinkedList doublyLinkedList=new LinkedList();
        int nodes,item;
        System.out.println("Enter number of nodes-");
        nodes=scanner.nextInt();
        System.out.println("Enter the values- ");
        doublyLinkedList.addMultipleLast(nodes);
        System.out.println("Enter the item to be searched- ");
        item=scanner.nextInt();
        boolean result=doublyLinkedList.search(item);
        if(result){
            System.out.println("Element is present in the list");
        }else{
            System.out.println("Element is not present in the list");
        }
        //doublyLinkedList.show();
    }
}

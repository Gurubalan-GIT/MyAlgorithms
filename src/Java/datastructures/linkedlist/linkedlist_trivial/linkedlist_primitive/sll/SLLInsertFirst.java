package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.sll;

public class SLLInsertFirst {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        int nodes;
        System.out.println("Enter how many nodes you want to add.");
        nodes=LinkedList.scanner.nextInt();
        System.out.println("Enter the data:");
        linkedList.addMultipleFirst(nodes);
        linkedList.show();
    }
}

package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.sll;

public class SLLDeleteLast {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        int nodes;
        System.out.println("Enter number of nodes-");
        nodes=LinkedList.scanner.nextInt();
        System.out.println("Enter the values:");
        linkedList.addMultipleLast(nodes);
        linkedList.deleteLast();
        linkedList.show();
    }
}

package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive.sll;

public class SLLSort {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter number of nodes-");
        int nodes = LinkedList.scanner.nextInt();
        System.out.println("Enter the values:");
        linkedList.addMultipleLast(nodes);
        System.out.println("Before Sorting- ");
        linkedList.show();
        System.out.println("After Sorting- ");
        linkedList.sort();
        linkedList.show();
    }
}

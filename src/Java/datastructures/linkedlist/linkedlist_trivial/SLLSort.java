package Java.datastructures.linkedlist.linkedlist_trivial;

public class SLLSort {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int nodes = LinkedList.scanner.nextInt();
        linkedList.addMultipleLast(nodes);
        linkedList.sort();
        linkedList.show();
    }
}

package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_primitive;

public class SLLDeleteItem {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int nodes, item;
        System.out.println("Enter number of nodes-");
        nodes = LinkedList.scanner.nextInt();
        linkedList.addMultipleLast(nodes);
        System.out.println("Enter item to be deleted-");
        item = LinkedList.scanner.nextInt();
        linkedList.deleteItem(item);
        linkedList.show();
    }
}

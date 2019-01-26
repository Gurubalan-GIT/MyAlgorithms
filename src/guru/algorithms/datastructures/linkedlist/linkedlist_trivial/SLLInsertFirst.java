package guru.algorithms.datastructures.linkedlist.linkedlist_trivial;

public class SLLInsertFirst {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        int nodes;
        System.out.println("Enter how many nodes you want to add.");
        nodes=LinkedList.scanner.nextInt();
        System.out.println("Enter the data:");
        for(int i=1;i<=nodes;i++)
        {
            int data = LinkedList.scanner.nextInt();
            linkedList.addFirst(data);
        }
        linkedList.show();
    }
}

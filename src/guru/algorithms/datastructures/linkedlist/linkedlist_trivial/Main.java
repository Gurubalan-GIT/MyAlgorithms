package guru.algorithms.datastructures.linkedlist.linkedlist_trivial;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        int nodes;
        System.out.println("Enter how many nodes you want to add.");
        nodes=scanner.nextInt();
        System.out.println("Adding to the last -");
        System.out.println("Enter the data:");
        for(int i=1;i<=nodes;i++)
        {
            int data = scanner.nextInt();
            linkedList.addLast(data);
        }
        linkedList.show();
        System.out.println("\nAdding to the First -");
        System.out.println("Enter the data:");
        for(int i=1;i<=nodes;i++)
        {
            int data = scanner.nextInt();
            linkedList1.addFirst(data);
        }
        linkedList1.show();
    }
}

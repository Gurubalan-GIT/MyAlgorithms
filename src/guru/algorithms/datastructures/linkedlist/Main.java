package guru.algorithms.datastructures.linkedlist;

import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        int nodes;
        System.out.println("Enter how many nodes you want to add.");
        nodes=scanner.nextInt();
        System.out.println("Enter the data:");
        for(int i=1;i<=nodes;i++)
        {
            int data = scanner.nextInt();
            linkedList.add(data);
        }
        linkedList.show();
    }
}

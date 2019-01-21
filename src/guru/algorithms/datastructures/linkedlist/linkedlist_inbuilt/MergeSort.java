package guru.algorithms.datastructures.linkedlist.linkedlist_inbuilt;


import java.util.LinkedList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        //List A
        Scanner scanner=new Scanner(System.in);
        int na,data;
        na=scanner.nextInt();
        while(na!=0){
            data=scanner.nextInt();
            linkedList.addLast(data);
            na--;
        }
        System.out.println(linkedList);
        LinkedList<Integer> linkedList1 =new LinkedList<>();
        //List B
        int nb=scanner.nextInt();
        while (nb!=0){
            data=scanner.nextInt();
            linkedList1.addLast(data);
            nb--;
        }
        System.out.println(linkedList1);
        //Now appending A and B
        linkedList1.addAll(linkedList);
        System.out.println(linkedList1);
    }
}

package guru.algorithms.datastructures.linkedlist.linkedlist_inbuilt;

import java.util.LinkedList;
import java.util.Scanner;

public class SLLRightSide {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        int na,data;
        na=scanner.nextInt();
        while(na!=0){
            data=scanner.nextInt();
            linkedList.add(data);
            na--;
        }
        System.out.println(linkedList);
    }
}

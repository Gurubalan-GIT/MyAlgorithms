package guru.algorithms.datastructures.linkedlist_inbuilt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        int n,data;
        n=scanner.nextInt();
        while(n!=0){
            data=scanner.nextInt();
            linkedList.addFirst(data);
            n--;
        }
        Iterator<Integer> integerIterator = linkedList.iterator();
        Iterator<Integer> integerIterator1 = linkedList.iterator();
        System.out.println("Printing Linked List - First add.");
        while(integerIterator.hasNext()){
            if(integerIterator1.next()==(linkedList.getLast())){
                System.out.println(integerIterator.next());
                break;
            }else {
                System.out.print(integerIterator.next()+"->");
            }
        }
        //Reversal of a Linked list with the help of descendingIterator!
        Iterator iterator = linkedList.descendingIterator();
        Iterator iterator1 = linkedList.descendingIterator();
        while(iterator.hasNext()){
            if(iterator1.next()==linkedList.getFirst()){
                System.out.print(iterator.next());
                break;
            }
            System.out.print(iterator.next()+"->");
        }
    }

}

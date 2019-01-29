package Java.datastructures.queues.queues_inbuilt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Enqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        while (nodes != 0){
            int data=scanner.nextInt();
            queue.add(data);
            nodes--;
        }
        System.out.println(queue);
    }
}

package guru.algorithms.datastructures.queues.queues_trivial;

import java.util.Scanner;

public class Queue {
    private int[] queue;
    private int total;
    private int rear;
    private int front;
    private int size;
    private static Scanner scanner=new Scanner(System.in);

    public Queue() {
        total=0;
        rear=0;
        front=0;
        size=100;
        queue=new int[size];
    }

    public Queue(int size) {
        total=0;
        rear=0;
        front=0;
        this.size = size;
        queue=new int[this.size];
    }

    boolean enqueue(int element){
        if(!isFull()){
            total++;
            queue[rear]=element;
            rear++;
            return true;
        }else{
            return false;
        }
    }

    int dequeue(){
        int item=queue[front];
        total--;
        front++;
        return item;
    }

    boolean isFull(){
        return (size==total);
    }

    boolean isEmpty(){
        return (total==0);
    }

}

package guru.algorithms.datastructures.stacks.stacks_trvial;

import java.util.Scanner;

public class Stack {
    private int[] stack;
    private int size;
    private int top;
    static Scanner scanner=new Scanner(System.in);
    //Default constructor
    public Stack() {
        top=-1;
        size=100;
        stack=new int[size];
    }
    //Parametrized constructor with getter
    Stack(int size){
        top=-1;
        this.size=size;
        stack=new int[size];
    }

    boolean push(int data){
        if(!isFull()){
            top++;
            stack[top]=data;
            return true;
        }else{
            return false;
        }
    }

    void pushAll(int size){
        if(!isFull()){
            while(size!=0) {
                int data=Stack.scanner.nextInt();
                push(data);
                size--;
            }
        }
    }

    int pop(){
        return stack[top--];
    }

    void popAll() {
        while(top!=-1){
            System.out.println(pop());
        }
    }

    boolean isFull(){
        return (top==stack.length-1);
    }

    void show() {
        for(int i:stack){
            System.out.println(i);
        }
    }
}

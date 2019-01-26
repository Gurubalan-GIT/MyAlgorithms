package guru.algorithms.datastructures.stacks.stacks_trvial;

public class Stack {
    private int[] stack;
    private int size;
    private int top;
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
    int pop(){
        return stack[top--];
    }
    boolean isFull(){
        return (top==stack.length-1);
    }
}

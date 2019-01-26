package guru.algorithms.datastructures.stacks.stacks_trvial;

import java.util.Scanner;

public class StackPushAndPop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size,data;
        size=scanner.nextInt();
        Stack stack = new Stack(size);
        if(!stack.isFull()){
            while(size!=0) {
                data=scanner.nextInt();
                stack.push(data);
                size--;
            }
        }
        System.out.println(stack.pop());
    }
}

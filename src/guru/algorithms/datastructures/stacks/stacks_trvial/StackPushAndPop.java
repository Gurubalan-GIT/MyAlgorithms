package guru.algorithms.datastructures.stacks.stacks_trvial;

public class StackPushAndPop {
    public static void main(String[] args){
        int size;
        System.out.println("Enter the size of the stack-");
        size=Stack.scanner.nextInt();
        Stack stack = new Stack(size);
        System.out.println("Enter the values to be pushed-");
        stack.pushAll(size);
        stack.show();
        System.out.println("The elements are popped now and shown-");
        stack.popAll();
    }
}

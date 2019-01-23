package guru.algorithms.datastructures.stacks.stacks_inbuilt;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBraces {
    public static final Scanner sc=new Scanner(System.in);
    public  static void main(String[] args){
        Stack<Character> braceStack = new Stack<>();
        String braceString=sc.nextLine();
        int closeFound=0;
        for(int i=0;i<braceString.length();i++){
            if(braceString.charAt(i)=='{') {
                braceStack.push(braceString.charAt(i));
            }
        }
        for(int i=0;i<braceString.length()-1;i++){
           closeFound = braceStack.search('}');
        }
        System.out.println(braceStack);
        System.out.println(closeFound);
    }

}

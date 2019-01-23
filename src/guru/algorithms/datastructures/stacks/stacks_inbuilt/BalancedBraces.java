package guru.algorithms.datastructures.stacks.stacks_inbuilt;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBraces {
    private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String parenthesesString = sc.nextLine();
        System.out.println(checkBalancedParentheses(parenthesesString));
    }
    private static String checkBalancedParentheses(String expr)
    {
        if (expr.isEmpty())
            return "Balanced";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return "Not Balanced";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Balanced";
            }
        }
        return stack.isEmpty()?"Balanced":"Not Balanced";
    }
}
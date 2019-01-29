/** WAP to find string is Palindrome
 * A string/word is palindrome if on reversing the word is same.
 * Eg 'madam' ,'amma' 'mom' are palindrome
 */

package Java.strings;

import java.util.Scanner;

public class pallindromeString {

	public static void main(String[] args) {
		
		String str;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First word");
		str=sc.next();
		
		StringBuilder sb =new StringBuilder(str);
		
		if(str.equals(sb.reverse().toString()))
		{
			System.out.println("String is Palindrome");
		}
		
		else
		{
			System.out.println("String is not Palindrome");
		}


	}

}

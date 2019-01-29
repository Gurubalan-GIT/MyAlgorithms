/* WAP to enter a word and print it in reverse order
*/

package Java.strings;

import java.util.Scanner;

public class printWord_reverse {
	@SuppressWarnings("Duplicates")
	public static void main(String[] args) {
		System.out.println("Enter the word");
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		

	}

}

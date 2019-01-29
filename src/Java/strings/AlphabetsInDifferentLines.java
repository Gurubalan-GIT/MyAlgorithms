/* WAP to enter a word and print alphabets in different lines
*/

package Java.strings;

import java.util.Scanner;

public class AlphabetsInDifferentLines {
	@SuppressWarnings("Duplicates")
	public static void main(String[] args) {
		
		System.out.println("Enter the word");
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		sc.close();
		
		
		

	}

}

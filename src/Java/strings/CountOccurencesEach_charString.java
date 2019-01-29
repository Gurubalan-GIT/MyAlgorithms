/* WAP to find the occurrence of each character in a word
 */

package Java.strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurencesEach_charString {

	public static void main(String[] args) {
		
		System.out.println("Enter the Word");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		char ch[]= s.toCharArray();
		int len = ch.length;
		
		HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();
		for(int i=0;i< len;i++)
		{
			if(countChar.containsKey(ch[i]))
			{
				countChar.put(ch[i], countChar.get(ch[i])+1);
			}
			else
			{
				countChar.put(ch[i], 1);
			}
		}
		System.out.println(countChar);

	}

}

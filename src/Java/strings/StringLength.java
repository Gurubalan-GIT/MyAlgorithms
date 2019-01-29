/** WAP to find the length of a word without using length()
 */

package Java.strings;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.next();
		int len=str.lastIndexOf("");
		System.out.println("The length is "+len);

	}

}

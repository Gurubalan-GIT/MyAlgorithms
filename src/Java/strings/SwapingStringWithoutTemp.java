/* WAP to swap two names without using third variable
 */

package Java.strings;

import java.util.Scanner;

public class SwapingStringWithoutTemp {

	public static void main(String[] args) {

		System.out.println("Enter the First name");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Enter the First name");
		String s2 = sc.next();
		System.out.println("Before Swapping..");
		System.out.println("s1=" + s1 + "     s2=" + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping");
		System.out.println("s1=" + s1 + "     s2=" + s2);
		sc.close();

	}

}

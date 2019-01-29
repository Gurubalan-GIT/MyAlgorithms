/* WAP to enter 5 names and print only names that are palindrome
*/
package Java.strings;

import java.util.*;

class display_PallindromeNames {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name[] = new String[5];
		int i, len, j;
		String rev = "";
		System.out.println("ENTER 5 NAMES IN ARRAY");
		for (i = 0; i < 5; i++) {
			name[i] = in.next();
		}
		System.out.println("Palindrome Names");
		for (i = 0; i < 5; i++) {
			len = name[i].length();
			rev = "";
			for (j = len - 1; j >= 0; j--) {
				rev = rev + name[i].charAt(j);
			}
			if (rev.equalsIgnoreCase(name[i])) {
				System.out.println(name[i]);
			}
		}
	}
}

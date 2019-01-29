/* WAP to enter a sentence and convert all the letters in Upper case without using toUpperCase()
**/

package Java.strings;

import java.util.*;

class ConvertToUpperCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1, s2 = "";
		int i, len;
		char ch;

		System.out.println("Enter a Sentence");
		s1 = in.nextLine();

		len = s1.length();
		in.close();

		for (i = 0; i < len; i++) {
			ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			s2 = s2 + ch;
		}
		System.out.println(s2);
	}
}

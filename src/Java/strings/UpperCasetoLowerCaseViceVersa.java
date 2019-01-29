/*
 * WAP to enter a sentence and replace upper case alphabets to Lower case and vice versa
 * For eg If the  sentence is 'This is a box'
 * Then o/p will be 'tHIS IS A BOX'
 */

package Java.strings;

import java.util.*;

class UpperCasetoLowerCaseViceVersa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, len;
		String s1, s2 = "";
		char ch;
		System.out.println("Enter a Sentence");
		s1 = in.nextLine();
		len = s1.length();
		for (i = 0; i < len; i++) {
			ch = s1.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			s2 = s2 + ch;
		}
		System.out.println("New String :" + s2);
	}
}

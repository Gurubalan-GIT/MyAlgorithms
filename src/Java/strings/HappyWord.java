/*
 * Write a description of class HappyWord here.
 * A word is Happy if the position of words is happy number
 * eg VAT
 */
package Java.strings;

import java.util.*;

class HappyWord {
	@SuppressWarnings("Duplicates")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str, s1 = "";
		int i, d, s = 0, n, len;
		char ch;
		System.out.println("Enter a word");
		str = in.next();
		in.close();
		str = str.toUpperCase();
		len = str.length();
		for (i = 0; i < len; i++) {
			s1 = s1 + (str.charAt(i) - 64);
		}
		n = Integer.parseInt(s1);
		while (n > 9) {
			s = 0;
			while (n > 0) {
				d = n % 10;
				s = s + (d * d);
				n = n / 10;
			}
			n = s;
		}
		if (n == 1) {
			System.out.println("It is Happy Word");
		} else {
			System.out.println("It is not Happy Word");
		}
	}
}

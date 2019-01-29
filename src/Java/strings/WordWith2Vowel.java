/* WAP to enter a sentence and print the word that contains two vowels
 */

package Java.strings;

import java.util.*;

class WordWith2Vowel {
	@SuppressWarnings("Duplicates")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1, s2 = "";
		int i, len, c = 0, p = 0;
		char ch1, ch2;
		System.out.println("Enter a sentence");
		s1 = in.nextLine();
		s1 = s1 + " ";
		len = s1.length();
		for (i = 0; i < len; i++) {
			ch1 = s1.charAt(i);
			ch2 = Character.toUpperCase(ch1);
			if (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {
				c++;
			}
			if (ch1 == ' ') {
				s2 = s1.substring(p, i);
				p = i + 1;
				if (c >= 2) {
					System.out.print(s2 + " ");
				}
				c = 0;
			}
		}

	}
}

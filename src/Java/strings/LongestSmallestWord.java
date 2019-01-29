/* WAP to enter a sentence and print the smallest and longest word
 * For eg if the sentence is 'This is India country'
 * Then the O/P must be 
 * Longest Word = country
  Smallest Word = is
 */
package Java.strings;

import java.util.*;

class LongestSmallestWord {
	@SuppressWarnings("Duplicates")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1, s2, max, min;
		int i, p, len;
		char ch;

		System.out.println("Enter a Sentence");
		s1 = in.nextLine();
		s1 = s1 + " ";
		len = s1.length();
		p = s1.indexOf(' ');// index of 1st blank space
		max = s1.substring(0, p); // extracting 1st word and assuming
									// it max
		min = max; // assuming 1st word as min too
		p = p + 1; // p is now storing index of 1st letter of 2nd word

		for (i = p; i < len; i++) {
			ch = s1.charAt(i);
			if (ch == ' ') {
				s2 = s1.substring(p, i);
				p = i + 1;
				if (s2.length() > max.length()) {
					max = s2;
				}

				if (s2.length() < min.length()) {
					min = s2;
				}
			}
		}
		System.out.println("Longest Word = " + max);
		System.out.println("Smallest Word = " + min);
	}
}

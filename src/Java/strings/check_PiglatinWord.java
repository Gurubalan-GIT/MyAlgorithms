/* WAP to check if word is Pig-latin
 * In "PigLatin" a word such as KING is replaced by INGKAY 
 * and TROUBLE is replaced by OUBLETRAY and so on.
 *  The first vowel of the original word becomes the start of the translation, 
 *  any proceeding letters being shifted towards the end
 *   and followed by AYwords that begin with vowels are left on changed.
 **/
package Java.strings;

import java.util.*;

class check_PiglatinWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1, s2, s3, s4;
		char ch;
		int i, len;
		System.out.println("Enter a word");
		s1 = in.next();
		s1 = s1.toUpperCase();
		len = s1.length();
		for (i = 0; i < len; i++) {
			ch = s1.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				break;
			}
		}
		s2 = s1.substring(i);// Extracting from vowel till end
		s3 = s1.substring(0, i); // Extracting before vowel
		s4 = s2 + s3 + "AY";
		System.out.println("IgLatin Form :" + s4);
		in.close();
	}
}

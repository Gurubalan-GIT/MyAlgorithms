/**WAP to input 10 names and print the longest name.
 */

package Java.strings;

import java.util.*;

class LongestNameArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name[] = new String[10];
		int i;
		String max;
		System.out.println("ENTER 10 NAMES IN ARRAY");
		for (i = 0; i < 10; i++) {
			name[i] = in.next();
		}
		max = name[0];
		for (i = 0; i < 10; i++) {
			if (name[i].length() > max.length()) {
				max = name[i];
			}
		}
		System.out.println("Longest Name =" + max);
		in.close();
	}
}

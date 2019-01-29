/** WAP to enter a word/sentence and find the missing alphabets not present(both upper case+lower case)
 */

package Java.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MissingAlphabets {

	public static void main(String[] args) {
		
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String newName=str.replaceAll(" ","");
		String inputArray[]=newName.split("");
		String alpha[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		
		HashSet<String> s1= new HashSet<String>(Arrays.asList(inputArray));
		HashSet<String> s2= new HashSet<String>(Arrays.asList(alpha));
		s2.removeAll(s1);
		System.out.println("Missing Alphabets "+s2);
		
		
		
		

	}

}

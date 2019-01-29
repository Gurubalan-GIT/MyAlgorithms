/* WAP to find the vowels count in a word
 */

package Java.strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VowelsinString {

	public static void main(String[] args) {
		System.out.println("Enter the Word");
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
		String temp =str.toLowerCase();
		char ch[] = temp.toCharArray();
		int len =temp.length();
		int flag=0;
		List<String> vowels= new ArrayList<String>();
		
		for(int i=0;i< len ;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				
				flag++;
				vowels.add(String.valueOf(ch[i]));
			}
		}
		
		System.out.println("The vowels count is "+ flag);
		
Iterator itr =vowels.iterator();
sc.close();

System.out.println("The vowels are...............");
while(itr.hasNext())
{
	System.out.print(itr.next()+" , ");
}


	}

}

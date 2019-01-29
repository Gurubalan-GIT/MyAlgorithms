/* WAP to input a sentence and print it from end.
 * Eg if the sentence entered is 'New Delhi is the capital of India'
 * Then the output is 'India of capital the is Delhi New'
 */
package Java.strings;

import java.util.*;
public class LastWordToFirstWord
{
    @SuppressWarnings("Duplicates")
	public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2;
        int i,p,len;
        char ch1;
        
        System.out.println("Enter a Sentence");
        s1=in.nextLine();
        s1=" "+s1;
        len=s1.length();
        p=len;
        in.close();
        for(i=len-1;i>=0;i--)
        {
            ch1=s1.charAt(i);
            if(ch1==' ')
            {
                s2=s1.substring(i+1,p);
                p=i;
                System.out.print(s2+" ");
            }
        }
    }
}

/* WAP to enter a sentence and print the words located at odd positions
 * Eg if sentence is 'India is a great nation'
 * Then the odd position words are India a nation
*/


package Java.strings;

import java.util.*;
public class WordsAtOddPosition
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,len,c=0,p=0;
        String s1,s2="";
        char ch;
        
        System.out.println("Enter a sentence");
        s1=in.nextLine();
        s1=s1+" ";
        len=s1.length();
        
        for(i=0;i<len;i++)
        {
            ch=s1.charAt(i);
            if(ch==' ')
            {
                s2=s1.substring(p,i);
                p=i+1;
                c++;
                if(c%2!=0)
                {
                    System.out.print(s2+" ");
                }
            }
        }   
    }
}

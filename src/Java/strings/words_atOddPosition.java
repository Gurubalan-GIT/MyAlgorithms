/*	WAP to enter a sentence and print the words that are present at odd positions
 * (whose position is an odd number like 1, 3, 5...)
 */
package Java.strings;

import java.util.*;

class words_atOddPosition
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,w1;
        int i,p=0,len,c=0;
        char ch;
        System.out.println("Enter a Sentence");
        s1=in.nextLine();
        
        s1=s1+" ";      
        len=s1.length();
        for(i=0;i<len;i++)
        {
            ch=s1.charAt(i);
            if(ch==' ')
            {
                c++;
                w1=s1.substring(p,i);
                p=i+1;
                if(c%2!=0)
                {
                    System.out.print(w1+" ");
                }
            }
        }
    }
}

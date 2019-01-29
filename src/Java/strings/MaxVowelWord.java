/* WAP to enter a sentence and print the word with maximum number of vowels
 */


package Java.strings;
import java.util.*;
class MaxVowelWord
{
    @SuppressWarnings("Duplicates")
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        String s,w,max="";
        int i,len,p=0,c=0,max_v=0;
        char ch;
        System.out.println("Enter a sentence");
        s=in.nextLine();
        s=s+" ";
        
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            ch=Character.toUpperCase(ch);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                c++;
            }
            if(ch==' ')
            {
                w=s.substring(p,i);
                p=i+1;
                if(c>max_v)
                {
                    max_v=c;
                    max=w;
                }
                c=0;
            }
        }
        System.out.println("Word with maximum no. vowel="+max);
        System.out.println("No. of vowels ="+max_v);
    }
}


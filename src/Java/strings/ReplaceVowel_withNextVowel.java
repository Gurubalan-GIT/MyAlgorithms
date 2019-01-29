/* WAP to enter a word and replace vowel with next vowel
 * If the word is 'Aeroplane'
 * Then the word will be after replacement 'EIRUPLENI
*/

package Java.strings;
import java.util.*;
class ReplaceVowel_withNextVowel
{
	public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2="";
        char v[]={'A','E','I','O','U'};
        int i,len,j,c=0;
        char ch1,ch2;
        System.out.println("Enter a word");
        s1=in.next();
        s1=s1.toUpperCase();
        len=s1.length();
        for(i=0;i<len;i++)
        {
            ch1=s1.charAt(i);
            c=0;
            for(j=0;j<5;j++)
            {
                if(ch1==v[j])
                {
                    c++;
                    break;
                }
            }
            if (c>0)
            {
                if(j==4)
                {
                    s2=s2+v[0];
                }
                else
                {
                    s2=s2+v[j+1];
                }
            }
            else
            {
                s2=s2+ch1;
            }
        }
        System.out.println(s2);
        in.close();
    }
}

/* WAP to enter a sentence and print those words that starts with a vowel
 */

package Java.strings;
import java.util.*;
class WordStartWithVowel
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2="";
        int i,len;
        char ch1,ch2;
        System.out.println("Enter a sentence");
        s1=in.nextLine();
        in.close();
        s1=s1+" ";
        
        len=s1.length();
        
        //extracting word
        for(i=0;i<len;i++)
        {
            ch1=s1.charAt(i);
            if(ch1 != ' ')
            {
                s2=s2+ch1;
            }
            else
            {
                ch2=s2.charAt(0);
                ch2=Character.toUpperCase(ch2);
                if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
                {
                    System.out.print(s2+" ");
                }
                s2="";
            }
        }
    }
}

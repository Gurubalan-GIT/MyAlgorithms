/* WAP to enter a sentence and print the words containing double letter sequence alphabets
 * Eg if Sentence is this is a book
 * then the word with double letter is This because in the alphabet series h,i are in sequence
 */

package Java.strings;
import java.util.*;
class doubleLetterSequenceWord
{
    public static void main(String[] args)
    {
        Scanner  in=new Scanner(System.in);
        int i,j,p=0,len1,len2;
        char ch1,ch2,ch3;
        String s1,s2;
        System.out.println("Enter a Sentence");
        s1=in.nextLine();
        s1=s1.toUpperCase();
        s1=s1+" ";
        len1=s1.length();
        in.close();
        for(i=0;i<len1;i++)
        {
            ch1=s1.charAt(i);
            if(ch1==' ')
            {   
                s2=s1.substring(p,i);
                p=i+1;
                len2=s2.length();
                for(j=0;j<(len2-1);j++)
                {
                    ch2=s2.charAt(j);
                    ch3=s2.charAt(j+1);
                    if(ch3-ch2==1)
                    {
                        System.out.print(s2+" ");
                        break;
                    }
                }
            }
       }
    }
}

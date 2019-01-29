/** WAP to capitalize first letter of each word in a sentence
 * if the sentence is 'this is a book'
 * Then o/p will be 'This Is A Book'
*/

package Java.strings;
import java.util.*;
class FirstLetterCapital
{
    @SuppressWarnings("Duplicates")
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2="";
        int i,len;
        char ch1,ch2;
        System.out.println("Enter a sentence");
        s1=in.nextLine();
        s1=s1.toLowerCase();
        s1=s1+" ";
        
        len=s1.length();
        in.close();
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
                s2=ch2+s2.substring(1);
                System.out.print(s2+" ");
                s2="";
            }
        }
    }
}

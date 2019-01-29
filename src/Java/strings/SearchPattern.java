/* WAP to enter a sentence and the enter a word(search pattern) and find its frequency
 * Eg if sentence is 'India capital is New Delhi'
 * and the search pattern 'is' the the frequency is 1
 */

package Java.strings;
import java.util.*;
class SearchPattern
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2="",sch;
        int i,len1,len2,c=0;
        
        System.out.println("Enter a sentence");
        s1=in.nextLine();
        System.out.println("Enter a search pattern");
        sch=in.next();
        
        len1=s1.length();
        len2=sch.length();
        for(i=0;i<=(len1-len2);i++)
        {
            s2=s1.substring(i,i+len2);
            if(s2.equalsIgnoreCase(sch))
            {
                c++;
            }
        } 
      System.out.println("Frequency of search pattern="+c);
    }
}

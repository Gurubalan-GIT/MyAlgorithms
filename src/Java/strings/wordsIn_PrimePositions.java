
/*	WAP to enter a sentence and print the words that are present at prime positions
 *  (whose position is a prime number like 2, 3, 5...)
 */
package Java.strings;
import java.util.*;
class wordsIn_PrimePositions
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,w1;
        int i,j,p=0,len,c=0,c1=0;
        char ch;
        System.out.println("Enter a Sentence");
        s1=in.nextLine();
        in.close();
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
                
                c1=0;
                for(j=1;j<=c;j++)//counting Factors
                {                // to check prime
                    if(c%j==0)
                    {
                        c1++;
                    }
                }
                if(c1==2)
                {
                    System.out.print(w1+" ");
                }
            }
        }
    }
}

/* WAP to enter a scentence and print it in alphbetical order
 * Eg if sentence is 'Apple a day keeps doctor away'
 * Then o/p will be A DAY AWAY APPLE KEEPS DOCTOR
 * 
 */

package Java.strings;
import java.util.*;
class SentenceWordLengthAlphaSort
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,temp;
        int i,j,p=0,len,n=0,k=0;
        char ch;
        System.out.println("Enter a sentence");
        s1=in.nextLine();
        in.close();
        s1=s1.toUpperCase();
        s1=s1+" ";
        len=s1.length();
        //counting no. of words
        for(i=0;i<len;i++)
        {
            ch=s1.charAt(i);
            if(ch==' ')
            {
                n++;
            }
        }
        String arr[]=new String[n];
        //transfer words in arr[]
        for(i=0;i<len;i++)
        {
            ch=s1.charAt(i);
            if(ch==' ')
            {
                arr[k]=s1.substring(p,i);
                p=i+1;
                k++;
            }
        }
        //sorting
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1-i);j++)
            {
                if(arr[j].length()>arr[j+1].length())
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else if(arr[j].length()==arr[j+1].length())
                {                
                    if(arr[j].compareTo(arr[j+1])>0)
                    {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        System.out.println("Words after sorting");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

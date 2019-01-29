/* WAP to find the smallest word in a Sentence
 */



package Java.strings;
import java.util.*;
class smallestWord
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
		
	
        Scanner in=new Scanner(System.in);
        int i,len,p=0;
        String s,w,min;
        char ch;
        
        System.out.println("Enter a sentence");
        s=in.nextLine();
         
        s=s+" ";
        len=s.length();
        p=s.indexOf(' ');
        min=s.substring(0,p);
        
        p=p+1;
        for(i=p;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                w=s.substring(p,i);
                p=i+1;
                if(w.length()<min.length())
                {
                    min=w;
                }
            }
        }
        System.out.println("Smallest word="+min);   
    }
}

/* WAP to input  10 names in an array, arrange them in length wise ascending
 order, when length of 2 names are same, 
 arrange them alphabetically.
 */
package Java.strings;

import java.util.*;
class NameLenAlphaSort
{
    @SuppressWarnings("Duplicates")
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String name[]=new String[10];
        int i,j;
        String temp;
        
        System.out.println("Enter 10 names ");
        for(i=0;i<10;i++)
        {
            name[i]=in.next();
            name[i]=name[i].toUpperCase();
        }
        //bubble sorting
        
        for(i=0;i<10;i++)
        {
            for(j=0;j<(9-i);j++)
            {
                if(name[j].length()>name[j+1].length())
                {
                    temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                }
                else if(name[j].length()==name[j+1].length())
                {                
                    if(name[j].compareTo(name[j+1])>0)
                    {
                        temp=name[j];
                        name[j]=name[j+1];
                        name[j+1]=temp;
                    }
                }
            }
        }
        System.out.println("Content of array after sorting");
        for(i=0;i<10;i++)
        {
            System.out.println(name[i]);
        }
    }
}


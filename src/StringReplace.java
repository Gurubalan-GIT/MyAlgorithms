import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String original=scanner.nextLine();
        char New=scanner.next().trim().charAt(0);
        char old=scanner.next().trim().charAt(0);
        System.out.println(new StringReplace().replace(original,New,old));
    }

    public String replace(String original,char New,char old){
        char[] tempCharArray= original.toCharArray();
        int i=0;
        char[] charArray=new char[tempCharArray.length];
        for(char c:tempCharArray){
            if(c==old){
                charArray[i]=New;
            }else{
                charArray[i]=c;
            }
            i++;
        }
        return new String(charArray);
    }
}

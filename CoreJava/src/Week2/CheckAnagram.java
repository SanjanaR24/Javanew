package Week2;
import java.util.Locale;
import java.util.*;

public class CheckAnagram {
    public static void main(String[] args){
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        s1=sc.nextLine();
        System.out.println("Enter second string");
        s2=sc.nextLine();
        char charArray1[] = s1.toCharArray();
        Arrays.sort(charArray1);
        char charArray2[] = s2.toCharArray();
        Arrays.sort(charArray2);

        //System.out.println(charArray2);
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("Not an anagram");
        }
        else
        for(int i=0; i<s1.length();i++){
               if(s1.charAt(i)==s2.charAt(i)){
                   System.out.println("Anagaram");
               }
        }
    }
}

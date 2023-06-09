package Week2;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input= sc.nextLine();
        input=input.toLowerCase();
        System.out.println(input);
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='A' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U'|| input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
            count++;
        }
        System.out.println(count);
    }
}

package main.java.Week2;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args){
        String temp;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 2 strings");
 String s1=sc.nextLine();
 String s2=sc.nextLine();
if(s1.length()!= s2.length()){
    System.out.println(" Not a rotation, FALSE");
}
else{
temp=s1+s1;
//System.out.println(temp);
if(temp.indexOf(s2)!=-1){
    System.out.println("True, Its Rotation");
}
else{
    System.out.println("False, Its not rotation");
}
}
    }
}

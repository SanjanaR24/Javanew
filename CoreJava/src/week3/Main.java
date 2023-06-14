package week3;//write a method that converts given string into an integer. Call the method with different inputs and print the return value.
// Print exception if it is thrown.

import week3.Conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Conversion c = new Conversion();
        c.conversiontoInt(s);

        //Custom exception with the same concept
        System.out.println("Enter a string");
        //Scanner sc1=new Scanner(System.in);
        try {
            String s1 = sc.nextLine();
            MyException me = new MyException();
            me.conversionToIntCustom(s1);
        } catch (MyException me) {
            System.out.println(me.getMessage());
        }

        // Printing 1 to 10 by extending Thread class
        PrintNumbersUsingThread numt=new PrintNumbersUsingThread();

        // Printing 1 to 10 by implementing Runnable Interface
        PrintNumUsingRunnable numr=new PrintNumUsingRunnable();
        Thread t= new Thread(numr);
        numt.start();
        t.start();
    }
}
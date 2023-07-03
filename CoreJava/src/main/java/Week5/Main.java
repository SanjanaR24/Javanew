package Week5;
import Week5.StringLength;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        //length
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        StringLength sm=new StringLength();
        Optional<Integer> op = sm.calculateLength(input);
         if (op.isPresent()) {
            int length = op.get();
            System.out.println("Length: " + length);
        } else {
            System.out.println(op);
        }

         // uppercase
        System.out.println("Enter a string to convert to UpperCase");
         String input1=sc.nextLine();
         StringtoUpperCase s=new StringtoUpperCase();
         Optional<String> op1 = s.stringUppercase(input1);
        if (op1.isPresent()) {
             input1 = String.valueOf(op1.get());
            System.out.println("Given String is: " + input1);
        } else {
            System.out.println(op1);
        }

    }
}
package Week2;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Reverse of a number
        Reverse rev= new Reverse();
        rev.reverseNum();

        //Printing age
        Age age=new Age();
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        age.checkAge(input);

        //Fibonnaci
        System.out.println("\n \t Fibonnaci Series");
FibClass fib1=new FibClass();
fib1.fibList();

//Divisible by 3,5 else print number
        System.out.println("\n \t Fizz Buzz ");
Divisible div=new Divisible();
div.printDivisible();
        }
    }
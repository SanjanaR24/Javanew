import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age;
        float weight;
float height;
       // System.out.printf("Hello and welcome!");
Person p=new Person();
System.out.println("Object created");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age, weight, height");
        p.age=s.nextInt();
        p.weight=s.nextFloat();
        p.height= s.nextFloat();

        System.out.println("Age is"+p.age);
        System.out.println("Weight is"+p.weight);
        System.out.println("height is"+p.height);
        double bmi=p.calculation();
        System.out.println("BMI is"+bmi);
        }
    }




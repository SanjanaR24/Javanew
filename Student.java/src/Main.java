import java.util.*;
public class Main {
    public static void main(String[] args) {
Student student1=new Student();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.nextLine();
        student1.setName(name);
        name=student1.getName();
        System.out.println(" Given Name is\t"+  name);

    }
}
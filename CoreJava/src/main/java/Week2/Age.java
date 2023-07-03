package main.java.Week2;
public class Age {

    int age;
    void checkAge(int age) {
        if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else if (age < 13) {
            System.out.println("Kid");
        } else System.out.println("Adult");


    }
}

package Week1.src;

public class Person {
    int age;
    float weight;
    float height;

    double calculation() {
        double bmi = weight / (height * height);
        return bmi;
    }
}
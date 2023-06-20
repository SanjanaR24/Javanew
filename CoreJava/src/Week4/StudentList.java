package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    //Given an ArrayList of Students, where each Student class has firstName, LastName and GPA as variables,
    // write a program to remove all the students who has GPA less than the average GPA. Then, print the remaining students.
    public static void main(String[] args) {
        double totalGPA = 0;
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sanjana", "Ravula", 3.68));
        studentList.add(new Student("Roshini", "Racha", 3.70));
        studentList.add(new Student("Rashmitha", "Aileni", 3.40));
        studentList.add(new Student("Rishika", "Cheruku", 3.90));
        studentList.add(new Student("Sangamithra", "Myntra", 3.30));
for( Student s: studentList){
    System.out.println(s);
}
        for (Student student : studentList) {
            totalGPA += student.getGpa();
        }
        double averageGPA = totalGPA / studentList.size();

        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGpa() >= averageGPA) {
                remainingStudents.add(student);
            }
        }

        System.out.println("Remaining students:");
        for (Student student : remainingStudents) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " (GPA: " + student.getGpa() + ")");
        }
    }
}

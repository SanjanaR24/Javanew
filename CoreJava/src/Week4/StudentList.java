package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        double totalGPA = 0;
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Sanjana", "Ravula", 3.68));
        studentList.add(new Student("Roshini", "Racha", 2.70));
        studentList.add(new Student("Rashmitha", "Aileni", 3.40));
        studentList.add(new Student("Rishika", "Cheruku", 2.90));
        studentList.add(new Student("Sangamithra", "Myntra", 3.30));

        for( Student student: studentList){
            System.out.println(student.getGpa());
}
       for (Student student : studentList) {
           totalGPA += student.getGpa();
       }
       double avg = totalGPA / studentList.size();
System.out.println("average is:"+avg);
    for (Student student : studentList) {
          if (student.getGpa() > avg) {
                System.out.println(student.getFirstName()+"  "+student.getLastName()+" "+student.getGpa());
           }
        }
    }

}


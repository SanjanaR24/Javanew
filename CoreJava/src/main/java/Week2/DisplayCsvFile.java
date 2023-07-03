package main.java.Week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import static java.util.Arrays.*;

public class DisplayCsvFile{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new File("/Users/sanjanaravula/Downloads/student.csv"));
        String line;

        Student[] stu = new Student[10];
        for(int i=0;s.hasNextLine();i++){
            line= s.nextLine();
            String[] str = line.split(",");
            String firstName = str[0];
            String lastName = str[1];
            float gpa = Float.parseFloat(str[2]);
            stu[i]= new Student(firstName, lastName, gpa);

        }

        sort(stu);

        for (int i=0;i<10;i++){
            System.out.println(stu[i]);
        }
    }
}


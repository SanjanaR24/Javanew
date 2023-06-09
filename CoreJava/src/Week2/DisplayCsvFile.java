package Week2;

import java.io.*;
import java.util.*;
public class DisplayCsvFile{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("/Users/sanjanaravula/Desktop/Assignments/Student.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
        }
        sc.close();

    }
}


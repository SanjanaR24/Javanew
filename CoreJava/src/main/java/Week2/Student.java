package main.java.Week2;

public class Student implements Comparable<Student>{

    String fn;
    String ln;
    float gpa;

    public Student(String fn, String ln, float gpa) {
        this.fn = fn;
        this.ln = ln;
        this.gpa = gpa;
    }

    public int compareTo(Student s) {
        return (this.ln).compareTo(s.ln);
    }

    @Override
    public String toString() {
        return this.fn+"  " +this.ln+"  " +this.gpa;
    }
}


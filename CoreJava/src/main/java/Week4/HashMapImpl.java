package Week4;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();
        Student s1 = new Student("Sanjana", "Ravula", 3.7);
        Student s2 = new Student("Roshini", "Racha", 3.5);
        Student s3 = new Student("Rishika", "Ch", 2.7);
        Student s4 = new Student("Sangamithra", "Reddy", 3.2);
        Student s5 = new Student("Rashmitha", "Aileni", 2.6);
        studentMap.put(s1.getFirstName(), s1);
        studentMap.put(s2.getFirstName(),  s2);
        studentMap.put(s3.getFirstName(), s3);
        studentMap.put(s4.getFirstName(), s4);
        studentMap.put(s5.getFirstName(), s5);
        System.out.println(studentMap);

        System.out.println("Displaying using Entry set"+studentMap.entrySet());
        System.out.println(" Displaying using ForEach");
        studentMap.forEach((key,value)->
                System.out.println( key + value));
        System.out.println("Displaying using keyset and iterator");
        System.out.println("key:"+studentMap.keySet());
        for(Student s:studentMap.values())
        System.out.println("values:" + s);

        Iterator<String> it = studentMap.keySet().iterator();
        while (it.hasNext())
        {
            String key = it.next();
            Student stu = studentMap.get(key);
            System.out.println("Key: " + key + "; Value:"+ studentMap.values());
        }
    }
}
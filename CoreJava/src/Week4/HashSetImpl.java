package Week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet();
        fruitSet.add("mango");
        String[] strings = {"apple", "banana", "cherry", "date","kiwi", "fig", "grape", "honeydew", "kiwi", "lemon","honeymelon","watermelon"};
        fruitSet.addAll(Arrays.asList(strings));
        System.out.print(fruitSet+"  ");
        System.out.println(" ");
        System.out.println(" Displaying using  Iterator ");
        Iterator<String> itr=fruitSet.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + "  ");
        }
            System.out.println(" ");
            System.out.println(" Displaying using  ForEach");
           fruitSet.forEach(i -> {System.out.print(i + " ");
           });
        System.out.println(" ");
        System.out.println(" Displaying using Streams ForEach");
        fruitSet.stream().forEach(i -> System.out.print(i+" "));
}
}
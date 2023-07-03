package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<String>(
                Arrays.asList("Friends",
                        "Manifest",
                        "Modern family"));
        System.out.println("Using for loop");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i) + " ");
        }

        System.out.println("-------***------");
        System.out.println(" Using enhanced For loop");
        for (String s : newList) {
            System.out.println(s + " ");
        }
        newList.add("Big Bang Theory");
        System.out.println("-------***------");
        System.out.println("Using Iterator ");
        Iterator itr = newList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next() + " ");

        int length = newList.size();
        newList.remove(length - 1);

        System.out.println("-------***------");
        System.out.println("Using ForEach loop");
        newList.forEach((n) -> System.out.println(n));

        System.out.println("-------***------");
        System.out.println(" Using Parallel stream");
        newList.parallelStream().forEach(s -> System.out.println(s));

}
}
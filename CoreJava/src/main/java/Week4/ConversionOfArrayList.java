package main.java.Week4;

import java.util.ArrayList;

public class ConversionOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("Ben");
        newList.add("Michaela");
        newList.add("Olive");
        System.out.println("Printing from an ArrayList");
        for ( String s:newList) {
            System.out.println(s);
        }
        int length=newList.size();
        String[] array = new String[length];
        array = newList.toArray(array);
        System.out.println("Printing from an Array");
for (String s: newList)
        {
            System.out.println(s);
        }


    }
}

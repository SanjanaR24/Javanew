package main.java.week3;

import java.util.Arrays;

public class Average  {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double avgOfSqrs = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n * n)
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + avgOfSqrs);
    }
}
package main.java.week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StringCap {
        public static void main(String[] args) {
            String[] strings = {"apple", "cat", "dog", "elephant","banana"};
            Stream<String> ss= Stream.of(strings);
            ss.map(s1 -> s1.substring(0,1).toUpperCase() + s1.substring(1))
                    .sorted()
                    .forEach(System.out::println);
        }
    }

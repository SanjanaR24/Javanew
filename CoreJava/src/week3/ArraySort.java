package week3;
import java.util.Arrays;
import java.util.Comparator;

    public class ArraySort  {
        public static void main(String[] args) {
            String[] strings = {"apple", "cat", "dog", "elephant","banana"};;

            Arrays.sort(strings, Comparator.comparingInt(String::length)
                    .thenComparing((str1, str2) -> {
                        if (str1.length() == str2.length()) {
                            return str2.charAt(str2.length() - 1) - str1.charAt(str1.length() - 1);
                        } else {
                            return 0;
                        }
                    }));

            System.out.println(Arrays.toString(strings));
        }
    }


package Week4;

import java.util.HashMap;
import java.util.Iterator;

public class DisplayDistinctChar {
    public static void main(String[] args) {
        //Given a string, write a program to print all the distinct characters and number of times that character is repeated in the string.
        String input = "test string";
        HashMap<Character, Integer> inputMap = new HashMap<>(input.length());
            char[] charArr = input.toCharArray();

            for(int i=0; i<input.length(); i++){
                if(charArr[i] != ' ') {
                    if (inputMap.containsKey(charArr[i])) {
                        int counter = inputMap.get(charArr[i]);
                        inputMap.put(charArr[i], counter + 1);
                    } else {
                        inputMap.put(charArr[i], 1);
                    }
                }
            }

            Iterator<Character> itr = inputMap.keySet().iterator();
            while (itr.hasNext()){
                Character key = (Character) itr.next();
                Integer value = inputMap.get(key);
                System.out.println(key + "-" + value);
            }
        }
    }



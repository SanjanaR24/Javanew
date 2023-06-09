package Week2;
import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int len = inputArray.length;

        for (int i = 0; i < len; i++) {
            for (int j = inputArray[i].length()-1; j >= 0; j--) {
                System.out.print(inputArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}


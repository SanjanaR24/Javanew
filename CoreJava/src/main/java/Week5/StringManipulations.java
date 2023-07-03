package Week5;

import java.util.Optional;
import java.util.Scanner;

public class StringManipulations {
    public Optional<Integer> calculateLength(String input) {
        if (input.isEmpty()) {
            return Optional.empty();
        } else {
            int length = input.length();
            return Optional.of(length);
        }
    }
    public Optional<String> stringUppercase(String input) {
        if (input.isEmpty()) {
            return Optional.empty();
        } else {
            input = input.toUpperCase();
            return Optional.of(input);
        }
    }
}

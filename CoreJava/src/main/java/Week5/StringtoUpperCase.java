package Week5;

import java.util.Optional;

public class StringtoUpperCase {
    public Optional<String> stringUppercase(String input) {
        if (input.isEmpty()) {
            return Optional.empty();
        } else {
            input = input.toUpperCase();
            return Optional.of(input);
        }
    }
}
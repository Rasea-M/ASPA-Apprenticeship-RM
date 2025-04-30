package Practicas.Optionals;

import java.util.Optional;

public class OptionalsMain {

    //Null fails, ask about test
    public static int getStringLength(Optional<String> input) {

        if (input.isPresent()) {
            return input.map(String::length).get();
        }
        return 0;
    }

    //there might be a different, better way to write this
    public static Optional<Integer> parseInteger(String input) {
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }

        try {
            return Optional.of(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }

    }
}

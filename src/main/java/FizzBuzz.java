import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
    public String replaceWithFizz(String inputString) {
        return Arrays.stream(inputString.split(",")).map(string -> {
            try {
                int number = Integer.parseInt(string);
                if (number % 3 == 0) {
                    return "fizz";
                }
            } catch (NumberFormatException e) {
                //do Nothing
            }
            return string;
        }).collect(Collectors.joining(","));
    }
}

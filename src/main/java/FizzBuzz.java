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

	static String replaceWithFuzzBuzz(String input) {
		return Arrays.stream(input.split(","))
				.map(FizzBuzz::convertToFizzBuzzIfDivisibleByThreeAndFive)
				.collect(Collectors.joining(","));
	}

	static String convertToFizzBuzzIfDivisibleByThreeAndFive(String numberString) {
		int parsedNumber = Integer.parseInt(numberString);
		return (parsedNumber % 3 == 0) && (parsedNumber % 5 == 0) ? "FizzBuzz" : numberString;
	}
}

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {
	@Test
	@Parameters({
			            "15, FizzBuzz",
			            "30, FizzBuzz",
	            })
	public void numberDivisibleByThreeAndFiveIsConvertedIntoFizzBuzz(String numberToConvert, String convertedNumber) {
		assertThat(FizzBuzz.convertToFizzBuzzIfDivisibleByThreeAndFive(numberToConvert)).isEqualTo(convertedNumber);
	}

	@Test
	public void numberDivisibleByThreeButNotFiveIsUnconverted() {
		assertThat(FizzBuzz.convertToFizzBuzzIfDivisibleByThreeAndFive("3")).isEqualTo("3");
	}

	@Test
	public void numberDivisibleByFiveButNotThreeIsUnconverted() {
		assertThat(FizzBuzz.convertToFizzBuzzIfDivisibleByThreeAndFive("5")).isEqualTo("5");
	}

	@Test
	public void commaSeparatedStringWithNumbersDivisibleByThreeAndFiveAreConvertedIntoFuzzBuzz() {
		assertThat(FizzBuzz.replaceWithFuzzBuzz("1,2,3,4,5,15")).isEqualTo("1,2,3,4,5,FizzBuzz");
	}

}

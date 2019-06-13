import static org.assertj.core.api.Assertions.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;

@RunWith(JUnitParamsRunner.class)
public class NumbersTest {
	@Test
	@Parameters({
			"3,1\\,2\\,3",
			"4,1\\,2\\,3\\,4",
	})
	public void createCommaSeparatedString(int max, String expected) {
		String commaSeparatedNumbers = FizzBuzz.separateWithCommas(max);
		assertThat(commaSeparatedNumbers).isEqualTo(expected);
	}
}

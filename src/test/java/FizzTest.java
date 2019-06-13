import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FizzTest {
    @Test
    public void testThatThreesAreReplacedWithFizz() {
        String outputstring = "1,2,fizz,4,5,fizz,7,8,fizz,10,11,fizz,13,14,fizzBuzz";

        String inputString = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,fizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.replaceWithFizz(inputString)).isEqualTo(outputstring);
    }
}

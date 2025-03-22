package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(10, 3, 20);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(2, 3, 18);
        Assertions.assertEquals(-1, result);
    }


    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(3, 2, 2);
        Assertions.assertEquals(2, result);
    }
}





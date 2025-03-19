package tudelft.numfinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumFinderTest {

    @Test
    public void testFindNormalCase() {
        NumFinder finder = new NumFinder();
        finder.find(new int[]{4, 80, 7, 9});
        assertEquals(4, finder.getSmallest());
        assertEquals(80, finder.getLargest());
    }

    @Test
    public void testFindReversedNumbers() {
        NumFinder finder = new NumFinder();
        finder.find(new int[]{4, 10, 2, 1});
        assertEquals(1, finder.getSmallest());
        assertEquals(10, finder.getLargest());
    }



    @Test
    public void testFindNegativeNumbers() {
        NumFinder finder = new NumFinder();
        finder.find(new int[]{-10, -15, -5, -1});
        assertEquals(-15, finder.getSmallest());
        assertEquals(-1, finder.getLargest());
    }
}

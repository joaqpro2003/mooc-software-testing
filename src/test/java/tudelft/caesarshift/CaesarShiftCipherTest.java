package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    CaesarShiftCipher cipher = new CaesarShiftCipher();

    @Test
    void testPositiveShift() {
        assertEquals("def", cipher.caesarShiftCipher("abc", 3));
    }

    @Test
    void testWrapAround() {
        assertEquals("abc", cipher.caesarShiftCipher("xyz", 3));
    }

    @Test
    void testNegativeShift() {
        assertEquals("xyz", cipher.caesarShiftCipher("abc", -3));
    }

    @Test
    void testSpacesAllowed() {
        assertEquals("mjqqt btwqi", cipher.caesarShiftCipher("hello world", 5));
    }

    @Test
    void testInvalidCharacter() {
        assertEquals("invalid", cipher.caesarShiftCipher("hello-world", 3));
    }
}


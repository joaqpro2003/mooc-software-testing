package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    GHappy ghappy = new GHappy();

    // Caso positivo: dos g seguidas hacen que sean "felices"
    @Test
    void testHappyG() {
        Assertions.assertTrue(ghappy.gHappy("xxggxx"));
    }

    // Caso negativo: una g aislada en medio no es "feliz"
    @Test
    void testUnhappyG() {
        Assertions.assertFalse(ghappy.gHappy("xxgxx"));
    }

    // Caso negativo: g al inicio sin vecino izquierdo
    @Test
    void testGAtStart() {
        Assertions.assertFalse(ghappy.gHappy("gxx"));
    }

    // Caso negativo: g al final sin vecino derecho
    @Test
    void testGAtEnd() {
        Assertions.assertFalse(ghappy.gHappy("xxg"));
    }

    // Caso positivo: secuencia de varias g seguidas
    @Test
    void testMultipleHappyG() {
        Assertions.assertTrue(ghappy.gHappy("agggb"));
    }

    // Caso positivo: cadena vacía (no hay g, se considera "feliz")
    @Test
    void testEmptyString() {
        Assertions.assertTrue(ghappy.gHappy(""));
    }
}

package com.evolve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for EvolveApp.
 */
class EvolveAppTest {

    @Test
    void testWelcomeMessage() {
        String expected = "WELCOME TO EVOLVE TECHNOLOGIES" + System.lineSeparator() + "HAPPY LEARNING........................";
        assertEquals(expected, EvolveApp.getWelcomeMessage());
    }
}

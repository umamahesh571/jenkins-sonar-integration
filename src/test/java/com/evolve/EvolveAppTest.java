package com.evolve;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for EvolveApp.
 */
public class EvolveAppTest {

    @Test
    public void testGetWelcomeMessage() {
        EvolveApp app = new EvolveApp();
        String expected = "WELCOME TO EVOLVE TECHNOLOGIES\nHAPPY LEARNING........................";
        assertEquals(expected, app.getWelcomeMessage());
    }
}

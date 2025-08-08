
package com.evolve;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for EvolveApp.
 */
public class EvolveAppTest {

    @Test
    public void testWelcomeMessage() {
        EvolveApp app = new EvolveApp();
        String message = app.getWelcomeMessage();
        assertTrue(message.contains("WELCOME TO EVOLVE TECHNOLOGIES"));
        assertTrue(message.contains("HAPPY LEARNING"));
    }
}

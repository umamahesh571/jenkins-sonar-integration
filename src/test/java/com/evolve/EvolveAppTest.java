package com.evolve;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvolveAppTest {

    @Test
    public void testWelcomeMessage() {
        EvolveApp app = new EvolveApp();
        String expected = "WELCOME TO EVOLVE TECHNOLOGIES\nHAPPY LEARNING........................";
        assertEquals(expected, app.welcomeMessage());
    }
}

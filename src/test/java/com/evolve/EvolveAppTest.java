package com.evolve;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvolveAppTest {

    @Test
    public void testWelcomeMessage() {
        EvolveApp app = new EvolveApp();
        assertEquals("WELCOME TO EVOLVE TECHNOLOGIES", app.welcomeMessage());
    }

    @Test
    public void testLearningMessage() {
        EvolveApp app = new EvolveApp();
        assertEquals("HAPPY LEARNING........................", app.learningMessage());
    }
}

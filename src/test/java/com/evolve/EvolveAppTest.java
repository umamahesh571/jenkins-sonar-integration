package com.evolve;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvolveAppTest {

    @Test
    public void testGetWelcomeMessage() {
        EvolveApp app = new EvolveApp();
        String message = app.getWelcomeMessage();
        assertTrue(message.contains("WELCOME TO EVOLVE TECHNOLOGIES"));
        assertTrue(message.contains("HAPPY LEARNING"));
    }

    @Test
    public void testIsLearningFun() {
        EvolveApp app = new EvolveApp();
        assertTrue(app.isLearningFun(), "Learning should be fun!");
    }
}

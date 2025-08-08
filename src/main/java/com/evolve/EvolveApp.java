package com.evolve;

/**
 * EvolveApp provides welcome message for Evolve Technologies.
 */
public final class EvolveApp {

    private static final String WELCOME_MESSAGE = "WELCOME TO EVOLVE TECHNOLOGIES";
    private static final String LEARNING_MESSAGE = "HAPPY LEARNING........................";

    /**
     * Returns the welcome message for display.
     * @return a formatted welcome message
     */
    public String getWelcomeMessage() {
        return WELCOME_MESSAGE + "\n" + LEARNING_MESSAGE;
    }
}

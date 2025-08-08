package com.evolve;

/**
 * This class provides a welcome message for Evolve Technologies.
 */
public final class EvolveApp {

    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String WELCOME = "WELCOME TO EVOLVE TECHNOLOGIES";
    private static final String MESSAGE = "HAPPY LEARNING........................";

    private EvolveApp() {
        // private constructor to prevent instantiation
    }

    /**
     * Gets the formatted welcome message.
     *
     * @return the welcome message
     */
    public static String getWelcomeMessage() {
        return WELCOME + LINE_SEPARATOR + MESSAGE;
    }
}

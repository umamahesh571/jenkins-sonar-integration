
package com.evolve;

/**
 * Main application class for Evolve Technologies.
 */
public class EvolveApp {
    /**
     * Returns the welcome message.
     * @return String message
     */
    public String getWelcomeMessage() {
        return "WELCOME TO EVOLVE TECHNOLOGIES\nHAPPY LEARNING........................";
    }

    public static void main(String[] args) {
        System.out.println(new EvolveApp().getWelcomeMessage());
    }
}

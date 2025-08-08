package com.evolve;

public class EvolveApp {
    public String getWelcomeMessage() {
        return "WELCOME TO EVOLVE TECHNOLOGIES\nHAPPY LEARNING........................";
    }

    public boolean isLearningFun() {
        return true;
    }

    public static void main(String[] args) {
        EvolveApp app = new EvolveApp();
        System.out.println(app.getWelcomeMessage());
    }
}

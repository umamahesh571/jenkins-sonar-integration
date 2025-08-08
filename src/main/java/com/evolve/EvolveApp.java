package com.evolve;

public class EvolveApp {

    public String welcomeMessage() {
        return "WELCOME TO EVOLVE TECHNOLOGIES";
    }

    public String learningMessage() {
        return "HAPPY LEARNING........................";
    }

    public static void main(String[] args) {
        EvolveApp app = new EvolveApp();
        System.out.println(app.welcomeMessage());
        System.out.println(app.learningMessage());
    }
}

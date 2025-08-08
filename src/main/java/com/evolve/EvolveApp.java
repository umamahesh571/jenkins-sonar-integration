package com.evolve;

public class EvolveApp {
    public String welcomeMessage() {
        return "WELCOME TO EVOLVE TECHNOLOGIES\nHAPPY LEARNING........................";
    }

    public static void main(String[] args) {
        System.out.println(new EvolveApp().welcomeMessage());
    }
}

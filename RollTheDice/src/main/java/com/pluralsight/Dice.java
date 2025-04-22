package com.pluralsight;

import java.util.Random;

public class Dice {
    // Made a method called roll and made a return
    private final Random random = new Random();

    public int roll() {
        return random.nextInt;

        Random randomNum = new Random();
        double maxValue = 0;
        double minValue = 0;
        int randomNumber = (int)(Math.random() * maxValue + minValue);

        // Created an instance of Dice named dice
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int two = 0;
        int four = 0;
        int six = 0;
        int seven = 0;

        // Creating the for loop

        for (int i = 1; i <= 100; i = i + 1) {
            roll1 = dice.roll();
            roll2 = dice.roll();

        }
        double sum = roll1 + roll2;
        System.out.println("Roll 1: " + roll1 + roll2 + "Sum: " + sum);




















    }
}

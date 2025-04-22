package com.pluralsight;


import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {10, 20, 35, 75, 88, 90, 90, 78, 100, 77, 22};
        Arrays.sort(testScores);

        double total = 0;
        for (int testScore : testScores) {
            total += testScore;

        }
        int numOfScores = testScores.length;
        double average = total/ testScores.length;
        System.out.printf("Average test score: %.2f\n", average);

        int lowScore = testScores[0];
        int highScore = testScores[testScores.length-1];

        System.out.println("Low score: " + lowScore);
        System.out.println("High Score: " + highScore);




    }
}

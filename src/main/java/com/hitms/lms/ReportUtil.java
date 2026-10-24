
package com.hitms.lms;

public class ReportUtil {

    public static double calculateAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public static void printReport(int[] scores) {
        System.out.println("Average: " + calculateAverage(scores));
    }

    public static void main(String[] args) {
        int[] scores = {78, 92, 55, 88};
        printReport(scores);
    }
}

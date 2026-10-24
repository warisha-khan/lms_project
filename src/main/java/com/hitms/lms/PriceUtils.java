
package com.hitms.lms;

/**
 * Utility methods for calculating book prices.
 */
public class PriceUtils {

    /**
     * Calculates the total of the given prices.
     *
     * @param prices array of prices
     * @return total price
     */
    public static double calculateTotal(double[] prices) {
        double total = 0;

        // Add each price to the total.
        for (double price : prices) {
            total += price;
        }

        return total;
    }

    /**
     * Calculates the average price.
     *
     * @param prices array of prices
     * @return average price, or zero for an empty array
     */
    public static double calculateAverage(double[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        return calculateTotal(prices) / prices.length;
    }

    public static void main(String[] args) {
        double[] prices = {100, 200, 300};

        System.out.println("Total: " + calculateTotal(prices));
        System.out.println("Average: " + calculateAverage(prices));
    }
}

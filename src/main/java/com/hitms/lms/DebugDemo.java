
package com.hitms.lms;

public class DebugDemo {
    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxValue = numbers[0];

        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{-5, -2, -9}));
    }
}

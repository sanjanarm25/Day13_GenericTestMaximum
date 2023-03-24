package com.bridgelabz;

public class TextMaximum {
    public static int findMax(int a, int b, int c) {
        Integer int1 = a;
        Integer int2 = b;
        Integer int3 = c;

        int max = int1;
        if (int2.compareTo(max) > 0) {
            max = int2;
        }
        if (int3.compareTo(max) > 0) {
            max = int3;
        }

        return max;
    }

    public static void main(String[] args) {
        // Test Case 1: max number at 1st position
        int max1 = findMax(10, 5, 3); // expected output: 10
        System.out.println(max1);

        // Test Case 2: max number at 2nd position
        int max2 = findMax(6, 8, 2); // expected output: 8
        System.out.println(max2);

        // Test Case 3: max number at 3rd position
        int max3 = findMax(4, 9, 15); // expected output: 15
        System.out.println(max3);


    }
}

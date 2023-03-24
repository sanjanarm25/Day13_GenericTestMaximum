package com.bridgelabz;

public class TextMaximum {
    public static int findMaxInteger(int a, int b, int c) {
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


    public static float findMaximum(float x, float y, float z) {

        return Math.max(x, Math.max(y, z));
    }


    public static String findMax(String s1, String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max) > 0) {
            max = s2;
        }
        if (s3.compareTo(max) > 0) {
            max = s3;
        }
        return max;
    }

    public static void main(String[] args) {
        // Test Case 1: max number at 1st position
        int max1 = findMaxInteger(10, 5, 3); // expected output: 10
        System.out.println(max1);

        // Test Case 2: max number at 2nd position
        int max2 = findMaxInteger(6, 8, 2); // expected output: 8
        System.out.println(max2);

        // Test Case 3: max number at 3rd position
        int max3 = findMaxInteger(4, 9, 15); // expected output: 15
        System.out.println(max3);

        System.out.println(findMaximum(10.5f, 7.2f, 3.8f)); // expected output: 10.5
        System.out.println(findMaximum(2.1f, 9.6f, 5.3f)); // expected output: 9.6
        System.out.println(findMaximum(4.9f, 1.2f, 8.5f)); // expected output: 8.5



        // Test case 1
        String s1 = "Apple";
        String s2 = "Peach";
        String s3 = "Banana";
        String max = findMax(s1, s2, s3);
        System.out.println("Test case 1: The maximum string is " + max);

        // Test case 2
        s1 = "Cat";
        s2 = "Dog";
        s3 = "Elephant";
        max = findMax(s1, s2, s3);
        System.out.println("Test case 2: The maximum string is " + max);

        // Test case 3
        s1 = "Monday";
        s2 = "Wednesday";
        s3 = "Friday";
        max = findMax(s1, s2, s3);
        System.out.println("Test case 3: The maximum string is " + max);


    }
}

package com.bridgelabz;

public class TextMaximum {


    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }


    public static void main(String[] args) {

        //test cases for integer

        int max1 = findMax(10, 5, 3);
        System.out.println(max1); // expected output: 10

        int max2 = findMax(6, 8, 2);
        System.out.println(max2); // expected output: 8

        int max3 = findMax(4, 9, 15);
        System.out.println(max3); // expected output: 15

        // Test cases for floats
        float max4 = findMax(10.5f, 7.2f, 3.8f);
        System.out.println(max4); // expected output: 10.5

        float max5 = findMax(2.1f, 9.6f, 5.3f);
        System.out.println(max5); // expected output: 9.6

        float max6 = findMax(4.9f, 1.2f, 8.5f);
        System.out.println(max6); // expected output: 8.5

        // Test cases for strings
        String max7 = findMax("Apple", "Peach", "Banana");
        System.out.println("Test case 1: The maximum string is " + max7);
        String max8 = findMax("Cat", "Dog", "Elephant");
        System.out.println("Test case 2: The maximum string is " + max8);

        String max9 = findMax("Monday", "Wednesday", "Friday");
        System.out.println("Test case 3: The maximum string is " + max9);
    }



}

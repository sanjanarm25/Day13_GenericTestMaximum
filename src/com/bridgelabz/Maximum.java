package com.bridgelabz;

public class Maximum <T extends Comparable<T>>{
    private T a;
    private T b;
    private T c;

    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T findMax() {
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
        // test case for integers
        Maximum<Integer> intMax = new Maximum<>(10, 5, 3);
        System.out.println(intMax.findMax()); // expected output: 10

        // test case for floats
        Maximum<Float> floatMax = new Maximum<>(10.5f, 7.2f, 3.8f);
        System.out.println(floatMax.findMax()); // expected output: 10.5

        // test case for strings
        Maximum<String> stringMax = new Maximum<>("Apple", "Peach", "Banana");
        System.out.println("Test case: The maximum string is " + stringMax.findMax());
    }


    }
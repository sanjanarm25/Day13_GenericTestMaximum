package com.bridgelabz;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maximum <T extends Comparable<T>>{
    private List<T> values;

    public Maximum(T... values) {
        this.values = Arrays.asList(values);
    }

    public T findMax() {
        Collections.sort(values);
        return values.get(values.size() - 1);

    }

    public static void main(String[] args) {
        // test case for integers
        Maximum<Integer> intMax = new Maximum<>(10, 5, 3, 8, 12);
        System.out.println(intMax.findMax()); // expected output: 12

        // test case for floats
        Maximum<Float> floatMax = new Maximum<>(10.5f, 7.2f, 3.8f, 9.1f, 6.7f);
        System.out.println(floatMax.findMax()); // expected output: 10.5

        // test case for strings
        Maximum<String> stringMax = new Maximum<>("Apple", "Peach", "Banana", "Mango", "Cherry");
        System.out.println("Test case: The maximum string is " + stringMax.findMax());
    }


    }
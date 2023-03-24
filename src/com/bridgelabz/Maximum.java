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

    public static <T extends Comparable<T>> void printMax(T max) {
        System.out.println("Maximum value: " + max);

    }

    public static void main(String[] args) {
        // test case for integers
        Maximum<Integer> intMax = new Maximum<>(10, 5, 3, 8, 12);
        Integer maxInt = intMax.findMax();
        printMax(maxInt); // expected output: Maximum value: 12

        // test case for floats
        Maximum<Float> floatMax = new Maximum<>(10.5f, 7.2f, 3.8f, 9.1f, 6.7f);
        Float maxFloat = floatMax.findMax();
        printMax(maxFloat); // expected output: Maximum value: 10.5

        // test case for strings
        Maximum<String> stringMax = new Maximum<>("Apple", "Peach", "Banana", "Mango", "Cherry");
        String maxString = stringMax.findMax();
        printMax(maxString); // expected output: Maximum value: Peach
    }

    }
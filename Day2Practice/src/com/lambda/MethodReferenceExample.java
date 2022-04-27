package com.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,20,15,16);
        arr.forEach(System.out::println);
    }
}

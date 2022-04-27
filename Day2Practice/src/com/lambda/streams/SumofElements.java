package com.lambda.streams;

import java.util.Arrays;

public class SumofElements {
    public static void main(String[] args) {
        int arr[] = {30,20,10};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}

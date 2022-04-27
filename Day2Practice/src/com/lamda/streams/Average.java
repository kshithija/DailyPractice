package com.lamda.streams;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int arr[] = {30,20,10};
        double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println(average);
    }
}

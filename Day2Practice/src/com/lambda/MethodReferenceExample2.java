package com.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,20,15,16);
     //   arr.forEach(MethodReferenceExample2::printSquare);
        arr.forEach(x -> System.out.println(printSquare2(x)));
    }

    public static void printSquare(Integer x){
        System.out.println(x*x);
    }
    public static int printSquare2(Integer x){
       return x*x;
    }
}

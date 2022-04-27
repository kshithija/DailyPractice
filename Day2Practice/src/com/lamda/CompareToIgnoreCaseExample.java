package com.lamda;

import java.util.Arrays;

public class CompareToIgnoreCaseExample {

    public static void main(String[] args) {
        String a[] = {"GFG", "IDE", "courses"};
        String b[] = {"gfg", "ide", "courses"};
// own comparator
        if(Arrays.equals(a, b, String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

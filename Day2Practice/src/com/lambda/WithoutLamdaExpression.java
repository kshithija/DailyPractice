package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class WithoutLamdaExpression {
    static void printCond(Collection<Integer> c, Predicate<Integer> p){
        for (Integer x : c)
            if(p.test(x))
                System.out.println(x+" ");
    }

    public static void main(String[] args) {
        Predicate<Integer> myPredicateEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return (x%2 == 0);
            }
        };
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        printCond(al, myPredicateEven);
    }
}

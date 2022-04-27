package com.lambda;

interface Test
{
    void print(Integer p);
}

public class MultiLineLamdaExpressions {
    static void fun(Test t, Integer p){
        t.print(p);
    }

    public static void main(String[] args) {
         fun(p -> {if(p%2 == 0) System.out.println("even"); else System.out.println("odd");}, 10);
        }
}

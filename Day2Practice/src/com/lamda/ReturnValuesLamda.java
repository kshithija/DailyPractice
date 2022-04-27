package com.lamda;

interface Test4
{
    void print(Integer p);
}

public class ReturnValuesLamda {

        static void fun(Test4 t, Integer p){
            t.print(p);
        }

        public static void main(String[] args) {
            fun(p -> System.out.println(p+2), 10);
        }

}

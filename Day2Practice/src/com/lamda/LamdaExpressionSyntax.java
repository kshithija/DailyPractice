package com.lamda;

interface Test1
{
    void print();
}

interface Test2
{
    void print(Integer p);
}

interface Test3
{
    void print(Integer p1, Integer p2);
}
public class LamdaExpressionSyntax {

    static void fun(Test1 t){
        t.print();
    }

    static void fun(Test2 t, Integer p){
        t.print(p);
    }

    static void fun(Test3 t, Integer p1, Integer p2 ){
        t.print(p1, p2);
    }
    public static void main(String[] args) {
        // No Parameter  () -> System.out.println("Hello");
            fun(() -> System.out.println("Hello"));

        // Single Parameter  p -> return System.out.println(p);
            fun(x -> System.out.println(x), 10);


        // MultiParameter  (p1, p2) -> System.out.println()
            fun((p1, p2) -> System.out.println(p1+ " "+p2), 10, 20);
    }

}

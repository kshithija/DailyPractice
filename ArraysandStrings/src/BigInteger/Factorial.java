package BigInteger;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n=1000;
       // System.out.println(factorial(n));
        System.out.println(bigIntegerFactorial(n));

    }

    private static int factorial(int n) {
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    private static BigInteger bigIntegerFactorial(int n){
        BigInteger fact = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            BigInteger x = BigInteger.valueOf(i);
            fact = fact.multiply(x);
        }
        return fact;
    }
}

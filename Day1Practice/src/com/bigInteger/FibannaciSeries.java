package Day1Practice.src.com.bigInteger;

import java.math.BigInteger;

public class FibannaciSeries {
    public static void main(String[] args) {
        int n =1000; // 0 1 1 2 3 5
      //  System.out.println(getFibannaciNumber(n));
        System.out.println(getBifIntegerFibannaciNumber(n));
    }

    private static int getFibannaciNumber(int n) {
        int fib1=0, fib2=1, fib3=1;
        for(int i=2;i<=n;i++){
            fib3=fib1+fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib2;
    }

    private static BigInteger getBifIntegerFibannaciNumber(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        for(int i=2;i<=n;i++){
            c=a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}


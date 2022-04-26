package Day1Practice.src.com.bigInteger;

import java.math.BigInteger;

public class PrimeandNextPrime {
    public static void main(String[] args) {
        int n=17;
        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));
    }

    private static int nextPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);
        String s = b.nextProbablePrime().toString();
        return Integer.parseInt(s);
    }

    private static boolean isPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(1);
    }
}

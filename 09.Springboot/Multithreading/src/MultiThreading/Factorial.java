package MultiThreading;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private BigInteger num;

    public Factorial(int i) {
        this.num = BigInteger.valueOf(i);
    }

    @Override
    public void run() {
        BigInteger ans = fact(num);
        System.out.println("Factorial of " + num + " is: " + ans);
    }

    public BigInteger fact(BigInteger num) {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger i = BigInteger.valueOf(2);
        while (i.compareTo(num) <= 0) {
            bigInteger = bigInteger.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return bigInteger;
    }
}

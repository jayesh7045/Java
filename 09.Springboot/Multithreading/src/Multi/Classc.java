package Multi;

import java.math.BigInteger;
import java.util.Arrays;

public class Classc implements Runnable {
    int num;
    Classc()
    {

    }
    Classc(int n)
    {
        this.num = n;
    }
    public void run(){
        factorial(this.num);
    }
    public BigInteger factorial(int n)
    {
        BigInteger ans = BigInteger.ONE;
        for(int i = 0; i < n; i++)
        {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

}

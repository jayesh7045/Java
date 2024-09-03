package Multi;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classb {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Integer[] arr = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
        Classb b = new Classb();
        List<Thread> l = new ArrayList<>();
        Arrays.stream(arr).parallel().forEach(i-> {
            Classc v = new Classc(i);
            Thread th = new Thread(v);
            th.start();
            l.add(th);
        });
        l.stream().forEach(i->{
            try{
                i.join();
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        });

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    /*public BigInteger factorial(Integer n)
    {
        BigInteger ans = BigInteger.ONE;
        for(int i = 1; i < n; i++)
        {
            ans  = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }*/
}

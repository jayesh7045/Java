package MultiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8 , 9, 10);
        l1.stream().forEach(e->{
            Factorial factorial = new Factorial(e);
            Thread t = new Thread(factorial);
            t.start();
        });

    }
}

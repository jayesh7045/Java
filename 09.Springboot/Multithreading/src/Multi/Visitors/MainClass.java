package Multi.Visitors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        VisitorClass v = new VisitorClass();
        for(int i = 0; i < 2000000; i++)
        {
            executorService.submit(v);
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(v.counter);


    }
}

package Multi.CallableClassDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClassDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CallableTask callableTask = new CallableTask();


        List<Future<String>> f = new ArrayList<>();
        for(int i  = 0; i < 20; i++)
        {
            Future<String> s = executorService.submit(callableTask);
            f.add(s);
        }

        f.stream().forEach(i -> {
            try{
                System.out.println(i.get());
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        });

    }
}

// we can create threads using runnable, but we can not create the threads using callable.

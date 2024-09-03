package Multi.CustomExecutorService;

import java.util.concurrent.*;

public class CustomEService {
    public static void main(String[] args) {
        int poolSize = 4;
        int maxPoolSize = 8;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(poolSize, maxPoolSize, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        // If in place of the ArrayList, if we will use the LinkedBlockingQueue<>(5);
        // Now by using LinkedBlockingQueue, the size of the threadPool will never grow than the pool size because the LinkedBlockingQueue will be never full. Because the LinkedBQ has linkedList and has not limits in storing the threads.
        Task task = new Task();
        for(int i = 0; i < 4; i++)
        {
            threadPoolExecutor.submit(task);
        }
        threadPoolExecutor.shutdown();
        // We have one more function related to the threadPoolExecutorService i.e awaitTermination(10, TIMEUNIT.MILLISECONDS)
        // This awaitTermination(timing, timeUnit) means it will wait for the above threads to get executed before proceeding for the below lines of code.
        // Matlab vo 10 millisec tak wait karega. aur 10 millisec ke baad hi uske niche ke lines execute karega.
        // If we want that ki sabse pehle sare tasks execute ho jane chahiye hai, fir hi age ke lines execute honi chahiye hai. In that case we can put this function with the timing value
        // By using the i.e awaitTermination(10, TIMEUNIT.MILLISECONDS), here we are telling the main thread to wait for 10 milliseconds
        // Means we are requesting main thread that you have to wait for the 10 milliseconds of time. And then you have to execute the further lines of code

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(task,60, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
        // The above method is used to schedule the task for 60 seconds later. So after 60 seconds the above method will
        // Schedule the task

    }


}

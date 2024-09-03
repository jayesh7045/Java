package ThreadPoolWaliBaatein;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Here the newFixedThreadPool will be calling the new ThreadPoolExecutors function in which we are passing the params like the corepoolsize, maxpoolsize and keepalivetime , etc.
        // All the functions by default are calling the ThreadPoolExecutors function, with different types of params or polymorphism
        Task task = new Task();
        for(int i = 0; i < 500; i++)
        {

            executorService.submit(task);
        }
        executorService.submit(task);
        executorService.shutdownNow();
        // Due

        // executorService.shutdownNow() This line will make sure that whenever the execution of the main thread reaches this line, then the executors service will be shut 0211down
    }
}

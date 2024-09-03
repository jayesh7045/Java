package Multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Classe {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ClasseTask c = new ClasseTask();
        Classc d = new Classc();
        for(int i = 0; i < 20; i++)
        {
            System.out.println("I am inside the main Class "+Thread.currentThread().getName());
            executorService.submit(c);
        }
        executorService.submit(d);
        executorService.shutdown(); // This line of code is imp to shut down all the active pools present in the executorService
        // But this shutdown will be called only if execution of all the threads will be completed. .
        executorService.submit(c);   // This will give us an error because after shutdown we can not add/submit more threads in it.

        executorService.shutdownNow();   // Here this will shut down all the fields as soon as the program reaches this line of execution.
        // So the difference between the shutdown and shutdownNow() is that the shutdownNow will shut down the thread pool as soon as
        // the program reaches this line

        // And the shutdown will be called when the execution of all the threads will be completed.

        //--------------------------------------------------------------------------------------------
        // There is one more method present in the ExecutorsService as ExecutorService executorservice = Executors.newSingleThreadExecutor();
        // This method is used to create a thread pool with a single thread

    }
}


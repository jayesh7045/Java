package SingletonClasses;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Logging {
    private Logging(){};
    public static Logging instance;

    public static Logging getInstance(){
        if(instance == null)
        {
            instance = new Logging();
        }
        return instance;
    }

    public static void main(String[] args) {
        TaskClass taskClass1 = new TaskClass();
        TaskClass taskClass2 = new TaskClass();

        // In a multithreaded environment, submitting tasks to ExecutorService may lead to inconsistent results.
        // Uncommenting the ExecutorService code and running it may cause different results each time due to racing conditions.
        /*
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<Logging> in1 = executorService.submit(taskClass1);
        Future<Logging> in2 = executorService.submit(taskClass2);
        System.out.println(in1.equals(in2));
        */

        // In a multithreaded environment, directly calling getInstance() may lead to inconsistent results.
        // Uncommenting the following lines and running may sometimes print true and sometimes false due to racing conditions.
        Logging in1 = Logging.getInstance();
        Logging in2 = Logging.getInstance();

        System.out.println(in1.equals(in2));

        // executorService.shutdown();
    }
}

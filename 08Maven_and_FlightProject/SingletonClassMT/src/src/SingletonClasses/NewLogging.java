package SingletonClasses;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NewLogging {
    private NewLogging(){};
    private static NewLogging instance;

    // Using synchronized block within the method ensures thread safety without blocking
    // all calls to getInstance(). This improves performance compared to synchronized methods.
    public static NewLogging getInstance(){
        // If we does not use the synchronized keyword,
        // then the two threads will create 2 different instances
        // of the NewLogging Class and will print false when we will do in1.equals(in2)
        if(instance == null)
        {
            synchronized (NewLogging.class){
                if(instance == null) {
                    System.out.println("My instance is null");
                    instance = new NewLogging();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        NewTaskClass taskClass1 = new NewTaskClass();
        NewTaskClass taskClass2 = new NewTaskClass();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<NewLogging> future1 = executorService.submit(taskClass1);
        Future<NewLogging> future2 = executorService.submit(taskClass2);

        // Wait for tasks to complete and get the instances returned by them
        NewLogging in1 = future1.get();
        NewLogging in2 = future2.get();

        // Compare the actual instances
        System.out.println(in1 == in2);

        executorService.shutdown();
    }
}

// Synchronized block and locks:
// The synchronized block ensures that only one thread can execute the critical section
// of code at a time. It does so by acquiring a lock on the object specified in the
// synchronized block (in this case, the class itself). Other threads attempting to enter
// the synchronized block must wait until the lock is released.

// Benefits of using synchronized block:
// 1. Granular control: Allows locking only specific sections of code rather than entire methods,
//    which can improve performance by reducing contention.
// 2. Flexibility: Different synchronized blocks can use different locks, allowing more fine-grained
//    synchronization control.

// Making code thread-safe:
// Synchronization ensures that only one thread can execute a synchronized block or method at a time,
// preventing race conditions and maintaining consistency in shared data. In this case, using a synchronized
// block within the getInstance() method ensures that only one instance of NewLogging is created even in a
// multithreaded environment, making the code thread-safe.

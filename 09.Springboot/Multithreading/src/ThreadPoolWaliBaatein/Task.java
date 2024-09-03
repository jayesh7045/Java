package ThreadPoolWaliBaatein;

import static java.lang.Thread.sleep;

public class Task implements Runnable{
    @Override
    public void run()
    {

        System.out.println("I am inside the task with thread name : " + Thread.currentThread().getName());
        
    }


}

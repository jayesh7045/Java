package Multi.Visitors;

import java.util.concurrent.atomic.AtomicInteger;

public class VisitorClass implements Runnable{
    int counter;
    VisitorClass() {
        counter = 0;
        // If made AtomicInteger then the constructor statement will look like
/*
        counter = new AtomicInteger(0);
*/
    }
    /// By using the keyword synchronization we are making the execution slower. Hence if we want to avoid the race condition we must use AtomicInteger in place of the integer
    //Just make the counter AtomicInteger
    public synchronized void run()
    {
        /*counter.addAndGet(1);*/  // if made the Atomix
        counter++;

    }
}



// inorder to avoid the race condition we must always prefer using the AtomicInteger as a dtype rather than the synchronized keyword

// Sync keyword makes the program slower
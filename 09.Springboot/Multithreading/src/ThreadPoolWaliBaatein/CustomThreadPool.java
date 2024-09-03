package ThreadPoolWaliBaatein;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPool {
    public static void main(String[] args) {
        // To create our own configurations for the Thread Pool
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
    }
}

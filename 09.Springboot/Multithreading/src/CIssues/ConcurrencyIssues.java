package CIssues;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyIssues {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Party party = new Party();
        for(int i = 0; i < 200000; i++)
        {
            executorService.submit(party);
        }
        executorService.shutdown();
        try {
            // Wait for all tasks to finish
            if (!executorService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
        System.out.println(party.visitorsCount);
    }
}

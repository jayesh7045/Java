package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        while(true)
        {
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();

                executorService.submit(new Runnable() {
                    @Override
                    public void run(){
                        try{
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("The data is "+data+" thread is "+Thread.currentThread().getName());
                    }
                });


        }
    }
}

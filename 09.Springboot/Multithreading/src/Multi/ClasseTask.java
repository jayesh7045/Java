package Multi;

public class ClasseTask implements Runnable{
    @Override
    public  void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am inside the runnable interface "+Thread.currentThread().getName());
    }
}

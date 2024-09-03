package Multi.CustomExecutorService;

public class Task implements Runnable{
    @Override
    public void run()
    {
        try{
            Thread.sleep(1000);
        }catch(Exception e)
        {
            throw new Error(e);
        }

        System.out.println("The task method is called "+Thread.currentThread().getName());
    }
}

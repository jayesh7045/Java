package Multi.ClassInconsistency;

public class Task implements  Runnable{
    static int count = 0;
    char v;
    Task(char i)
    {
        this.v = i;
    }
    public void run()
    {
        if(v == 'w')
        {
            while(count != 5)
            {
                count++;
                System.out.println("The writer is writing the data "+count);
                try{
                    Thread.sleep(1000);

                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }

        }
        else if(v == 'r')
        {
            int data = 0;
            while(true)
            {
                if(data != count)
                {
                    data = count;
                    System.out.println("The system is reading in the data "+ data);
                }

            }
        }

    }

}


// In this when we are not using the volatile keyword, at that time the variable is stored in the Registers of the system
// When the data is stored inside the registers of the system, the memory inconsistency issues are arising, because the write task
// is using the different memory and read task is reading from the diff memory.

// But when we are using the volatile keyword
// In this case the variable is stored in the cache memory and a single copy of that variable is accessed to all the users in the program
// So the data that is stored inside the registers, those variables can cause inconsistencies.

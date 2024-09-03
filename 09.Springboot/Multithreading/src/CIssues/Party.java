package CIssues;

public class Party implements Runnable {

    public int visitorsCount;
    Party()
    {
        visitorsCount = 0;
    }
    @Override
    public void run()
    {
        getCount();
    }
    public void getCount()
    {
        visitorsCount++;
    }
    public void printCount()
    {
        System.out.println(visitorsCount);
    }


}

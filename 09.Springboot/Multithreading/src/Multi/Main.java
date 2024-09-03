package Multi;

public class Main {
    public int add(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println("This is the main Function");
        Main mainobj = new Main();
        int a = mainobj.add(1, 2);
        System.out.println(a);
    }
}

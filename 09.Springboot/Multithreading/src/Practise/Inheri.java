package Practise;

class A{
    public int getSum()
    {
        return 100;
    }
}
class B extends A{
    public int getSum()
    {
        return 200;
    }
}
class c extends B{
    public int getSum()
    {
        return 300;
    }
}
public class Inheri {
    public static void main(String[] args) {
        B b = new B();
        A a = (A)b;
        A a1 = new B();
        A b1 = (A)a1;
        System.out.println(b.getSum());
    }
}

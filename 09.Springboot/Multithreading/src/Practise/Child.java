package Practise;

public class Child extends Parent {
    Child()
    {
        System.out.println("This is the Hascode of Child class");

        System.out.println(this.hashCode());
    }

    public static void main(String[] args) {

        Child c = new Child();
    }

}

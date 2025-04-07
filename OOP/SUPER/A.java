package OOP.SUPER;

public class A {
    public A ()
    {
        System.out.println("In A");
    }

    public A (String name)
    {
        this(); // this execute the method of the same class e.g the class A above
        System.out.println( name + " In A");
    }
}



package OOP.SUPER;

public class B extends A{

    public B ()
    {
        //This is saying to excute parameterized constructor which class A is inherited 
        super("Tayo");
        System.out.println("In B");
    }
}

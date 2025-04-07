import Constructor.User;
import OOP.*;
import OOP.SUPER.*;
import OOP.POLYMORPHISM.*;
@SuppressWarnings("unused")

public class Main 
{
    public static void main(String[] args)
    {
        DATATYPE DATATYPE = new DATATYPE();
        Switch_Statement Switch_Statement = new Switch_Statement();
        Calculator calculator = new Calculator();
        int result = calculator.add(65,72);
        System.out.println(result);
        Arrayy arr = new Arrayy();
        ForEach product = new ForEach();
        User newUuser = new User(18, "Tayo");
        System.out.println(newUuser.getAge() + ": " + newUuser.getName());
        
        //annonymous Instance 
        new User(20, "Tosin");

        VeryAdvCalc calc =  new VeryAdvCalc();
        int add = calc.add(3, 4);
        int sub = calc.sub(56, 38);
        int multi = calc.multi(10, 50);
        int division = calc.div(12, 4);
        double power = calc.power(4, 5);
        System.out.println(add + " " + sub + " " + multi + " " + division);
        System.out.println("This is the power :" + power);
        B newB = new B();
        System.out.println(newB);

        Read data = new Write();
        data = new Read();
        
        data.read();
       




    }
}

package Constructor;

public class User {
    private int age;
    private String name;
    
    //Default Constructor
    public User(){
        this.age = 12;
        this.name = "Tayo";
    }

    //Parameterised Constructor
    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    
    public String getName(){
        return name;
    }

}

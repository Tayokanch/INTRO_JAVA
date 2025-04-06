package Encapsulation;
//Keeping  class and its object close and tight//

// TO ge a value with the private keyword you can use a method to get it 

public class Human{
    private int age  ;
    private String name ;

    // using method to set the value of age
    public void setAge(int age){
        this.age = age;
    }
    // using method to get the value of age
    public int getAge(){
        return age;
    }


    // using method to set the value of name
    public void setName(String name){
        this.name = name;
    }
    // using method to get the value of name
    public String getName(){
        return name;
    }
}
    


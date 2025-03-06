/*
 DATA TYPE
 - Primitive Data Type
    Integer - byte, short, int, long
    byte size = 1 bytes / 8bits Range: -128 to 127
    *Int size = 4btyes - They are suitable for bigger value, Ranging from Range: -2,147,483,648 to 2,147,483,647
    *Long size = 4bytes - They are suitable for bigger value, Ranging from Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    *Short size = 2byts - They are suitable for bigger value, Ranging Range: -32,768 to 32,767	
    NOTE: The high the bytes the bigger the size

    Float - double, float
    Character - char -> 2bytes / 16bits
    Boolean - true or false
 
 */


 class DATATYPE {
    DATATYPE() {
    }
 
    public static void main(String[] args){
       String name = "TAYO";
       long amount = 787823478234l;
       int age = 24;
       short price = 6372;
       char a = 'z';
       boolean isActive = true; 
       float rice = 5.7f;
       int convert = (int) rice;

       if(amount > age  )
         System.out.println(true);
        else
         System.out.println(false);
       System.out.println(convert);
    }
    Conditional_Statement cs = new Conditional_Statement();
 }
 
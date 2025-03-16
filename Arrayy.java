public class Arrayy<items> {
    
    public Arrayy(){
        String[] items = new String [4];
        int num[]= {5,8,9,5};

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        };

        //Multi-dimentional Array

        int example [][] = new int[3][4];
        String products[][] = {{"Rice", "Orange", "Coke"},{"Pasta", "Oil", "Salt"},{"Tomatoes","Apple", "Spring Pepper"},{"Yorghut", "Salad", "Curry"}};
        for(int i = 0; i < products.length; i++){
            for(int j = 0; j < products[i].length; j++){
                System.out.println(products[i][j]);
            }
        }
    }



};

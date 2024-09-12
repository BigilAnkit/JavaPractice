package OPPS;

class Data{
    //Private variable
    private String name;

    // getter method
   String getName(){
        return this.name;
    }

    // setter method
   void setName(String name){
        this.name = name;
    }

}

public class Main2 {
    public static void main(String[] main){
        // create an object of Data

        Data d = new Data();


        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());

    }
}

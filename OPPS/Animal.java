package OPPS;

class Animal{
    // protected method
    protected void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    public static void main(String[] args) {

        //create an object of Dog Class
        Dog dog = new Dog();
        // access protected method
        dog.display();

    }
}

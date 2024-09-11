class StaticTest {

    // non-static mehtod
    int multiply(int a,int b){
        return a*b;
    }

    // static method
    static int add(int a, int b){
        return a*b;
    }
    
}

public class StaticKey0 {
    
    public static void main(String[] args) {
        
        // Create an instance of the staticTest class
        StaticTest st = new StaticTest();

        // call the nonstatic method
        System.out.println("2 * 2 = " + st.multiply(2,2));

        System.out.println("2 * 4 = "+StaticTest.add(2,4)); 
    }
}

package extra;

public class Assertion {

    //IDE can't detect this assert method 
    //so we can use cmd for compiling
    
    public static void main(String[] args) {

        int x = 1;

        assert (x > 1);
        assert(x > 0) : "Assertion Error Caught";
        
        System.out.println("Everything is ok");
    }
}

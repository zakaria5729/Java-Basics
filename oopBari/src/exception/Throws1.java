/**
*checked exception = all exception without runtime exceptions + errors
*checked exception can be a custom exception and its goes with "throws" and "throw" keyword
*/

package exception;

public class Throws1 {
    
    static void validate(int age) throws ClassNotFoundException {
        if (age < 18) {
            throw new ClassNotFoundException("not allowed"); //not a custom exception
        } else {
            System.out.println("Welcome to vote");
        }
    }
    
    public static void main(String[] args) {
        
        try {
            validate(12);
            
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            
        } finally {
            System.out.println("rest of the code...");
        }
    }
}

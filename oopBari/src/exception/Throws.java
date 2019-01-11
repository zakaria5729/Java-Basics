/**
*checked exception = all exception without runtime exceptions + errors
*checked exception can be a custom exception and its goes with "throws" and "throw" keyword
*/

package exception;

public class Throws {
    
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            //throw new InvalidAgeException();
            throw new InvalidAgeException("Not allowed here"); //custom exception
        } else {
            System.out.println("Welcome to vote");
        }
    }
    
    public static void main(String[] args) {
        
        try {
            validate(12);
            
        } catch (InvalidAgeException e) {
            System.out.println(e);
            
        } finally {
            System.out.println("rest of the code...");
        }
    }
}

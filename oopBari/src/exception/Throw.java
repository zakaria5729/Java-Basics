/**
 *unchecked exception = all of runtime exceptions + errors
 *unchecked exceptions can not be custom exceptions and its goes with "throw" keyword only
 */
package exception;


public class Throw {

    static void divided(int n1, int n2) {
        if (n2 <= 0) {
            //throw new CanNotByZero("not allowed"); throws can not be a custom exception
            throw new ArithmeticException("Not allowed here");
        } else {
            System.out.println(n1/n2);
        }
    }

    public static void main(String[] args) {

        try {
            divided(10, 0);
            
        } catch (Exception e) {
            System.out.println(e);
            
        } finally {
            System.out.println("rest of the code...");
        }
    }
}

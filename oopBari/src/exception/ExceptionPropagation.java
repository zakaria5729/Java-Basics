/**
*method er life cycle er je kono ak jaygay exception handle korakei bole exception propagation
*/

package exception;

public class ExceptionPropagation {
    
    static void n() {
        int data = 10 / 0;
    }
    
    static void m() {
        try {
            n();
        } catch (Exception e) {
            System.out.println(e + " (Exception handle)");
        }
    }
    
    static void p() {
        m();
    }
    
    public static void main(String[] args) {
        
        p();
        System.out.println("Normal flow..");
    }
}

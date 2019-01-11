package exception_handling;

public class Exception {
    public static void main(String[] args) {
        
        try {
            int x = 0;
            int y = 4;
            int k = y/x;
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finish");
        }
    }
}

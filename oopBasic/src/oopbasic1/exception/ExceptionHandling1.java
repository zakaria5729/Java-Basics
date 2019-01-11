package oopbasic1.exception;

public class ExceptionHandling1 {

    public static void main(String[] args) {

        try {
            int x = 10, y = 0;
            int[] array = new int[3];
            //array[3] = 3;
            int z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("sub: " + e);
        }   catch(Exception f) {
            System.out.println("super = " + f);
        }
        finally {
            System.out.println("Last line of this program");
        }
    }
}

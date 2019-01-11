package extra;

public class UseOfFinallyBlock {

    static int process(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        } finally {
            System.out.println("finish...");
        }
    }

    public static void main(String[] args) {
        int sum = process(10, 0);
        System.out.println(sum);
    }
}

package extra;

public class VarArgs {

    public static void test(int ... num) {
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        test(10);
        test(10, 20);
        test(10, 20, 30);
        test(10, 20, 30, 40);
        test(10, 20, 30, 40, 50);
    }
}

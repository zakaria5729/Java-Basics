package hackkerrank;

import java.util.Scanner; 

public class StaticInitializerBlock {

    static Scanner input = new Scanner(System.in);

    static int b = input.nextInt();
    static int h = input.nextInt();
    static boolean flag = true;

    static {
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = b * h;
            System.out.print(area);
        }
    }
}

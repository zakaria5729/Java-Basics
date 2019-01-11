package mathematicaloperator;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

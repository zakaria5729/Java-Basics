package oopbasic1.exception;

import java.util.Scanner;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        int count = 0;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter two number: ");
                int x = input.nextInt();
                int y = input.nextInt();
                int result = x / y;
                System.out.println("result = " + result);
                count++;

            } catch (Exception e) {
                System.out.println("exception = " + e);
            }
        } while (count == 0);
    }
}

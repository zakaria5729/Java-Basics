package hackkerrank;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        while (input.hasNext() == true) {
            i++;
            System.out.println(i + " " + input.nextLine());
        }
    }
}

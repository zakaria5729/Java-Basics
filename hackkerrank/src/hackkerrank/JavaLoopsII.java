package hackkerrank;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;       
        
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int l = input.nextInt();
            
            int sum = a;
            int res = 1;
            
            for (int j = 0; j < l; j++) {
                if(count == 0) {                   
                    sum = sum + b; 
                    count++;
                    System.out.print(sum);
                }
                else {
                    res = res * 2;
                    sum = sum + (res*b);
                    System.out.print(" " + sum);
                }
            }
            System.out.println();
            count = 0;
        }
    }
}

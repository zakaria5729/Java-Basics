package NestedClass;

import java.util.Scanner;

public class TestOuter2 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.print(s1);
                int l = 15 - s1.length();
                
                while(l > 0) {
                    System.out.print(" ");
                    l--;
                }
                
                if(x < 100 && x >= 10) {
                    System.out.println("0" + x);
                }
                else if(x < 10) {
                    System.out.println("00" + x); 
                }
                else {
                    System.out.println(x); 
                }           
            }
            System.out.println("================================");
    }
}

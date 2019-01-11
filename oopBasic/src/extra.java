
import java.io.*;
import java.util.*;

public class extra {

    public static void main(String[] args) {
        
//        Scanner sc=new Scanner(System.in);
//        String A = sc.next();
//        String B = sc.next();
//        
//        String c = A.reverse();
//        
//        int l = A.length() + B.length();
//        System.out.println(l);
//        
//        int n = A.charAt(0);
//        int m = B.charAt(0);
//        
//        
//        if(n <= m) {
//            System.out.println("No");
//        } else  {
//            System.out.println("Yes");
//        }
//        
//        System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1) + " " + Character.toUpperCase(B.charAt(0))+B.substring(1));
   
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        char[] c1 = A.toCharArray();
//        char[] c2 = new char[20];
//        int j = 0;
//        for (int i = c1.length-1; i >=0; i--) {
//           c2[j++] = c1[i];
//        }
//        System.out.println(c2);
//        //c2[j] = null;
//        
//        String B = String.valueOf(c2);
//        
//        if(A.equals(B)) {
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        String B = sb.toString();
        
        if(A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    
    }
}

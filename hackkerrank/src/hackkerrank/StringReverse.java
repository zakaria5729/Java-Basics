package hackkerrank;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) throws Exception {        
        
        Scanner input = new Scanner(System.in);
        String str = input.next();
        
        char[] rev = null;
        char[] ch = str.toCharArray();
        int j = 0;    
        
        for (int i = ch.length-1; i>=0; i--) {
            rev[j++] = ch[i];
        }
        
        if (ch.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

package hackkerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        boolean status = false;
        
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        String str1 = new String(A);
        String str2 = new String(B);
        
        if(str1.equals(str2)) {
            status = true;
        }
        
        return status;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

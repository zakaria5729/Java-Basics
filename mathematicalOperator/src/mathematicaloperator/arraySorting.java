package mathematicaloperator;

import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args) {
        int[] num = {10, 2, 5, 3, 19};
        Arrays.sort(num);
        
        for (int i : num) {
            System.out.println(i);
        }
        
        System.out.println();
        String names[] = {"amar", "sonar", "bangla", "tomay"};
        Arrays.sort(names);
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}

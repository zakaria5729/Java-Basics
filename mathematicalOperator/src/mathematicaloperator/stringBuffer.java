package mathematicaloperator;

import java.util.Scanner;

public class stringBuffer {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        
        String st = input.nextLine();
        StringBuffer sb = new StringBuffer(st);
        System.out.println(sb);
        
        /*string buffer append*/
        sb.append(" hossain ");
        sb.append(25);
        System.out.println(sb);
        
        /*replace*/
        sb.replace(0, 5, "amar");
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        
        /*set length method*/
        sb.setLength(8);
        System.out.println(sb);
        
        /*delete*/
        sb.delete(0, 6);
        System.out.println(sb);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

package oopbasic1;

public class StringComparison {
    
    public static void main(String[] args) {
        
        String s1 = "zakaria";
        String s2 = "zakaria";
        String s3 = new String("zakaria");
        String s4 = new String("zakaria");
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        
        System.out.println();
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
    }
}

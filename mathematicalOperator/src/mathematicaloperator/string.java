package mathematicaloperator;

public class string {
    public static void main(String[] args) {
        String s1 = "Zakaria Hossain";
        String s2 = new String("Zakaria hossain");
        
        System.out.println("length: " + s1.length() + " " + s2.length());
        
        if(s1.equals(s2)) {
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }
        
        /*ignore case*/
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("equlas");
        }
        else {
            System.out.println("not equals");
        }
    }
}

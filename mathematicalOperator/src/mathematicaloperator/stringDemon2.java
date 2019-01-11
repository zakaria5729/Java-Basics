package mathematicaloperator;

public class stringDemon2 {
    public static void main(String[] args) {
        String firstName = "Zakaria";
        String lastName = " Hossain";
        
        /*concat without any method*/
        String fullName = firstName + lastName;
        System.out.println("Full name: " + fullName);
        
        /*concat string method*/
        fullName = firstName.concat(lastName);
        System.out.println("Full name: " + fullName);
        
        /*lowercase method*/
        fullName = fullName.toLowerCase();
        System.out.println("Full name: " + fullName);
        
        /*uppercase*/
        fullName = fullName.toUpperCase();
        System.out.println("Full name: " + fullName);
        
        /*startswith method*/
        boolean b = firstName.startsWith("Zaka");
        System.out.println("b = " + b);
        
        /*endswith method*/
        b = firstName.endsWith("Zaka");
        System.out.println("b = " + b);
    }
}

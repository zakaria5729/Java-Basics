package StringClass;

public class EqualCheck {

    public static void main(String[] args) {
        String s1 = "Yes";
        //String s2 = "Yes";
        String s2 = "Y"+"es";
        //String s = "Y";
        //String s2 = s+"es";
        //String s2 = new String("Yes");
        
        if(s1 == s2) {
            System.out.println("== operator checks object reference");
        }
        else {
            System.out.println("s1 & s2 are not same object");
        }
        
        if (s1.equals(s2)) {
            System.out.println("equals() method checks value");
        }
        else {
            System.out.println("s1 & s2 values are different");
        }
        
        String s3 = new String("Yes");
        String s4 = new String("Yes");
        //s3 = s4;
        
        if (s3 == s4) {
            System.out.println("object of s3 eq s4");
        }
        else {
            System.out.println("object of s3 neq s4");
        }
        
        if (s3.equals(s4)) {
            System.out.println("value s3 eq s4");
        }
        else {
            System.out.println("value s3 neq s4");
        }
    }
}

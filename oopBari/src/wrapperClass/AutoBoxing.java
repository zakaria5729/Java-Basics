package wrapperClass;

public class AutoBoxing {
    
    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt); //autoBoxing
        System.out.println(wInt);
        
        //we can write also
        Integer wInt1 = pInt;
        System.out.println(wInt1);
        
        int p1 = wInt; //unBoxing
        System.out.println(p1);
        
        int p2 = wInt1;
        System.out.println(p2);
    }
}

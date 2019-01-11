package java_object_assign_to_arrays;

public class JavaObjectAssignToArrays {
    
    int a = 10;
    static int b = 15;

    public static void main(String[] args) {
        JavaObjectAssignToArrays obj = new JavaObjectAssignToArrays();
        obj.a = 12;
        System.out.println(obj.a);
        
        JavaObjectAssignToArrays obj2 = new JavaObjectAssignToArrays();
        System.out.println(obj2.a);
        
        JavaObjectAssignToArrays obj3 = new JavaObjectAssignToArrays();
        obj3.a = 22;
        System.out.println(obj3.a);
        
        JavaObjectAssignToArrays.b = 12;
        System.out.println(JavaObjectAssignToArrays.b);
        
        System.out.println(JavaObjectAssignToArrays.b);
        
        
        
        
        
//        User[] user = new User[2];
//        user[0] = new DefaultUser("zakaria");
//        user[1] = null;
//        
//        Account[] accounts = new Account[2];
//        accounts[0] = new SavingAccount(100);
//        accounts[0].deposit(50);
//        accounts[0].calculateInterest();
//        accounts[1] = null;
//        
//        System.out.println(user[0].getName());
//        System.out.println(user[1]);
//        
//        System.out.println(accounts[0].getAmount());
//        System.out.println(accounts[0].getAmount());
//        System.out.println(accounts[1]);
    } 
}

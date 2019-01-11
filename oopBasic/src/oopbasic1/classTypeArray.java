package oopbasic1;

class account {
    int a;
    String b;
    
    account(int a, String b) {
        this.a = a;
        this.b = b;
    }
    
    public void showData() {
        System.out.println("value of a = " +a+ "\nvalue of b = " +b);
    }
}

public class classTypeArray {
    
    public static void main(String[] args) {
        
        account ob[] = new account[2];
        ob[0] = new account(1, "dhaka");
        ob[1] = new account(3, "khulna");
        
        System.out.println("For array element 0:");
        ob[0].showData();
        
        System.out.println("For array element 1:");
        ob[1].showData();
        
    }
}

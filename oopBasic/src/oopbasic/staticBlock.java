package oopbasic;

public class staticBlock {
    
    static int id;
    static String name;
    static byte bt;
    static long lg;
    static double db;
    
    static {
        id = 23;
        name = "static";
        bt = 44;
        lg = 3234;
        db = 434.434;
    }
    
    void display1() {
        System.out.println(id+" "+" "+name+" "+bt+" "+" "+lg+" "+" "+db);
    }
    
   static void display2() {
        System.out.println(id+" "+" "+name+" "+bt+" "+" "+lg+" "+" "+db);
    }
}

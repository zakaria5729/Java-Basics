package inner_class;

public class StaticInnerClassExample {
    
    int a = 19;
    
    static class StaticInnerClass {
        static int b = 10;
        int c = 15;
    }
    
    public static void main(String[] args) {
        StaticInnerClassExample ob = new StaticInnerClassExample();
        System.out.println(ob.a);
        
        System.out.println(StaticInnerClassExample.StaticInnerClass.b);
        
        StaticInnerClass inner = new StaticInnerClass();
        System.out.println(inner.c);
    }
}

package inner_class;

public class MemberInnerClassExample {
    int i = 5;
    
    public static void main(String[] args) {
        MemberInnerClassExample obj = new MemberInnerClassExample();
        System.out.println(obj.i);
        
        MemberInnerClassExample.MemberInnerClass inner = obj.new MemberInnerClass();
        inner.b = 15;
        System.out.println(inner.b);
    }
    
    class MemberInnerClass {
        int b = 10;
    }
}

package ToStirngMethod;

public class ToStringMethod {
    
    int s1, s2;
    
    public ToStringMethod(int st1, int st2) {
        s1 = st1;
        s2 = st2;
    }
    
    @Override
    public String toString() {
        return "[" + s1 + " " + s2 + "]";
    }
    
    public static void main(String[] args) {
        ToStringMethod ts = new ToStringMethod(1, 2);
        System.out.println(ts);
        //System.out.println(ts.toString());
    }
}

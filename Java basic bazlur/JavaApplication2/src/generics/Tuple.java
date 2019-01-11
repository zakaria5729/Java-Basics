package generics;

public class Tuple<X, Y> {

    private X x;
    private Y y;
    
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }
    
    public void showType() {
        System.out.println("Type of X is "+x.getClass().getName()+" and value: "+x);
        System.out.println("Type of Y is "+y.getClass().getName()+" and value: "+y);
    }
 
    public static void main(String[] args) {
        Tuple<String, Integer> tuple = new Tuple<>("Hello", 12);
        
        System.out.println(tuple.getX());
        System.out.println(tuple.getY());
        
        tuple.showType();
        
        Tuple<String, Tuple<Integer, Double>> tuple1 = new Tuple<>("amar", new Tuple<>(12, 13.3));
        System.out.println(tuple1.getX());
        System.out.println(tuple1.y.getX());
        System.out.println(tuple1.y.getY());
        
        tuple1.y.showType();
    }
}

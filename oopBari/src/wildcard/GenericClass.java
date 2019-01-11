package wildcard;

public class GenericClass<T> {

    private T t;
    
    GenericClass(T l) {
        t = l;
    }
    
    T get() {
        return t;
    }
    
    public static void main(String[] args) {
        
        GenericClass<Integer> in = new GenericClass<>(19);
        GenericClass<String> st = new GenericClass<>("amar");
        
        System.out.println(in.get());
        System.out.println(st.get());
    }
}

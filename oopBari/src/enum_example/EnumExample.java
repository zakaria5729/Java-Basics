package enum_example;

public class EnumExample {

    int value;
    public enum Day {
        SUN, SAT, MON, TUE, WED, THU, FRI //those var is constant means public static final
    };
    
    public static void main(String[] args) {
        for(Day s : Day.values()) {
            System.out.println(s);
        }
    }
}

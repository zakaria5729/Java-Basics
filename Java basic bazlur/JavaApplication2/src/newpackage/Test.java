package newpackage;

public class Test {
    public static void main(int i) {
        System.out.println("int main method");
    }
    public static void main(Double args) {
        System.out.println("double main method");
    }
    public static void main(String args) {
        System.out.println("String method");
    }
    public static void main(String[] args) {
        System.out.println("String array method");
        main(5);
        main(6.5);
        main("my");
    }
} 

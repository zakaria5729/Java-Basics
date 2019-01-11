package wildcard;

public class GenericMethod {

    public static <E> void printArray(E[] arr) {
        for(E elem : arr) {
            System.out.printf("%s ",elem);
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        Integer[] inArr = {1, 2, 3, 4, 5};
        Double[] dbArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stArr = {"amar", "sonar", "bangla"};
        Character[] chArr = {'h', 'e', 'l', 'l', 'o'};
        
        System.out.println("Int array");
        printArray(inArr);
        
        System.out.println("db array");
        printArray(dbArr);
        
        System.out.println("str array");
        printArray(stArr);
        
        System.out.println("char array");
        printArray(chArr);
    }
}

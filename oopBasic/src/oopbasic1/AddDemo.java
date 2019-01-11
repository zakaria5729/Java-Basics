package oopbasic1;

public class AddDemo {
    
    void add(int ... num) {
        int sum = 0;
        
        for (int i : num) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}

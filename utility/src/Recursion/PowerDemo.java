package Recursion;

public class PowerDemo {
    int count = 0;
    
    int pow(int n1, int n2) {
        if (count == n2) {
            return 1;
        }
        else {
            count++; 
            return n1*pow(n1, n2);
        }
    }
}

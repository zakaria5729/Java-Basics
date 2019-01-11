package methodoverloading;

public class methodClass {
    int performAddition(int a, int b) {
        int res = a+b;
        return res;
    }
    
    int performAddition(int a, int b, int c, int d) {
        int res = a+b+c+d;
        return res;
    }
    
    float performAddition(float a, float b) {
        float res = a+b;
        return res;
    }
}

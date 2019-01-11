/**
*UpperBoundWildcard
* List<? extends Number> means a list of objects that are instances of
*the class Number, or subclass of Number (e.g. Integer or Double)
*/

package wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

    //public static float sum(List<? extends String> element) {
    public static float sum(List<? extends Number> element) {
        float sum = 0;
        for(Number n : element) {
            sum += n.floatValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        double sum = sum(l);
        System.out.println(sum);
    }
}

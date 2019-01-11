/**
*LowerBoundWildcard
* List<? super Integer> means that the list is typed to either the
*Integer class, or a superclass of Integer such as Number
*/

package wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {

    public static void add(List<? super Integer> elem) {
        elem.add(5);
    }
    
    public static void main(String[] args) {
        
        List<Number> inL = new ArrayList<>();
        inL.add(1);
        inL.add(2);
        inL.add(3);
        inL.add(4);
        add(inL);
        
        System.out.println(inL + "\n");
        double sum = 0;
        for(Number n : inL) {
            sum += n.doubleValue();
        }
        System.out.println(sum);
        
    }
}

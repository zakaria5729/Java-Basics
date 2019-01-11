package wildcard;

/**
*UnBoundWildcard uses for an unknown type generic to a list or a collections
*it is same as using <? extends Object> that means we can pass any type which is extends the Object class
*/

import java.util.ArrayList;
import java.util.List;

public class UnBoundWildcard {

    public static void processElements(List<?> element) {
        for (Object ob : element) {
            System.out.println(ob);
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(40);
        processElements(ints);
        System.out.println();

        List<Double> db = new ArrayList<>();
        db.add(10.7);
        db.add(20.7);
        db.add(30.7);
        db.add(40.7);
        processElements(db);
    }
}

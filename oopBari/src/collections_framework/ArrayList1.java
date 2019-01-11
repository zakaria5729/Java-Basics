
package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList();

        aList.add("amar");
        aList.add("sonar");
        aList.add("bangla");

        System.out.println("Normal loop");
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        System.out.println("\n" + "While loop");
        int j = 0;
        while (aList.size() > j) {
            System.out.println(aList.get(j++));
        }

        System.out.println("\n" + "Iterator loop");
        Iterator<String> it = aList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

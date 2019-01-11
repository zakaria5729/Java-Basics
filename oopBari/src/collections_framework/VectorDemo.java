
package collections_framework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        //initial size is 3, increment is 2
        
        Vector v = new Vector(3, 2);
        //Vector<String> v = new Vector(3, 2);
        //Vector<Integer> v = new Vector(3, 2);

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new String("amar"));
        v.addElement("sonar");
        v.addElement("bangla");
        v.addElement("ami");

        System.out.println("After size: " + v.size());
        System.out.println("After capacity: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("After size: " + v.size());
        System.out.println("After capacity: " + v.capacity());

        
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
        
        if (v.contains(3)) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
        
        System.out.println(v);
        
        System.out.println(v.remove(2));
        System.out.println(v);
        
        v.add("bangla");
        System.out.println(v);
        
        //print vector using enumeration
        Enumeration vEnum = v.elements();
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}

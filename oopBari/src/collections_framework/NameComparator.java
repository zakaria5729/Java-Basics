package collections_framework;

import java.util.Comparator;

public class NameComparator implements Comparator {

    @Override
    public int compare(Object ob1, Object ob2) {
        Student2 s1 = (Student2) ob1;
        Student2 s2 = (Student2) ob2;
        
        //return s1.name.compareTo(s2.name);
        return s2.name.compareTo(s1.name);
    }
    
//     @Override
//    public int compare(Object ob1, Object ob2) {
//        String s1 = (String) ob1;
//        String s2 = (String) ob2;
//        return s1.compareTo(s2);
//    }

}

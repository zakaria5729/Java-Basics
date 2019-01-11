package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparator1 {

    public static void main(String[] args) {

        ArrayList<Student2> as2 = new ArrayList<>();
        as2.add(new Student2(101, "Zakaria", 23));
        as2.add(new Student2(102, "Hossain", 27));
        as2.add(new Student2(103, "Saharia", 21));
        
        Collections.sort(as2, new NameComparator());
        Iterator<Student2> it = as2.iterator();
        while (it.hasNext()) {
            Student2 st = it.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

//          ArrayList<String> al = new ArrayList<>();
//          al.add("sonar");
//          al.add("amar");
//          al.add("bangla");
//          al.add("tomay");
//          System.out.println(al);
//          
//          Collections.sort(al, new NameComparator());
//          System.out.println(al);
    }
}

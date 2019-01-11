package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable1 {
    
    public static void main(String[] args) {
        
        ArrayList<Student1> as = new ArrayList<>();
        as.add(new Student1(101, "Zakaria", 23));
        as.add(new Student1(102, "Hossain", 27));
        as.add(new Student1(103, "Saharia", 21));    
        
        Collections.sort(as);
        Iterator<Student1> it = as.iterator();       
        while (it.hasNext()) {
            Student1 st = it.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }       
    }
}

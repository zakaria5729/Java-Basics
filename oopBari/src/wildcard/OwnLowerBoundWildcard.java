package wildcard;

import java.util.ArrayList;
import java.util.List;

class SuperClass {
}

class ChildClass extends SuperClass { 
}

class GrandChildClass extends ChildClass { 
}

public class OwnLowerBoundWildcard {

    public static void main(String[] args) {
        
        List<GrandChildClass> grand = new ArrayList<>();
        grand.add(new GrandChildClass());
        addClass(grand);
        
        List<ChildClass> child = new ArrayList<>();
        //child.add(new ChildClass());
        child.add(new GrandChildClass());
        addClass(child);
               
        List<SuperClass> supers = new ArrayList<>();
        //supers.add(new SuperClass());
        supers.add(new GrandChildClass());
        addClass(supers);   
    }
    
    public static void addClass(List<? super GrandChildClass> element) {
        element.add(new GrandChildClass());
        System.out.println(element);     
    }
}

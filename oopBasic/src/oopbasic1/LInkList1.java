package oopbasic1;

import java.util.LinkedList;

public class LInkList1 {

    public static void main(String[] args) {

        //LinkedList<Integer> link1 = new LinkedList<Integer>(); //we can not initialize the size
        LinkedList<String> link2 = new LinkedList<String>();
        
        link2.add("Zakaria");
        link2.add("Hossain");
        link2.add("Saharia");
        link2.add("Hossain");
        link2.add(4, "Hasib");  //add using index
        link2.addFirst("First");
        link2.addLast("Last");
        
        for(String s : link2) {
            System.out.println(s);
        }
        
        link2.remove(4);
        link2.remove("Hossain");
        link2.removeFirst();
        link2.removeLast();
        
        System.out.println("\n" + link2 + "\n");
        
        System.out.println(link2.getFirst());
        System.out.println(link2.getLast());
        
        System.out.println("\n"+link2.isEmpty());
        
        link2.clear();
        System.out.println(link2);
        System.out.println(link2.isEmpty());
        
        
        //        link1.add(10);
//        link1.add(20);
//        link1.add(30);
//        link1.add(40);
        
        //print using for each loop
//        for (Integer i : link1) {
//            System.out.println(i);
//        }

        //System.out.println("link1 = " + link1);
        //System.out.println("link2 = " + link2);
        
    }
}

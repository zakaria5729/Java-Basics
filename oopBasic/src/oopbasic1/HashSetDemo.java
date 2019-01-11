package oopbasic1;

import java.util.HashSet;

public class HashSetDemo {
    
    public static void main(String[] args) {
        
        //HashSet can't contain duplicate value
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(10);
        hs.add(10);
        hs.add(12);
        
        System.out.println(hs);
        System.out.println();
        
        for(Integer i : hs) {
            System.out.println(i);
        }
        System.out.println();
        
        hs.remove(10);
        System.out.println(hs);
        
        System.out.println(hs.isEmpty());
        
        hs.clear();
        System.out.println(hs);
    }
}

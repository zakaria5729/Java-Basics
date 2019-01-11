package collections_framework;

import java.util.Collection;
import java.util.Iterator;

import java.util.List; //interface
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import java.util.Set; //interface
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet; //interface
import java.util.TreeSet;

import java.util.Map; //interface
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap; //interface
import java.util.TreeMap;
import java.util.Hashtable;

import java.util.Queue; //interface
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionExample {

    public static void main(String[] args) {      
        
        //List l1 = new ArrayList();
        ArrayList l1 = new ArrayList();
        l1.add("amar");
        l1.add("sonar");
        l1.add("bangla");
        l1.add("amar");
        System.out.println("ArrayList: " + l1);
        
        //List l2 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l2.add("amar");
        l2.add("sonar");
        l2.add("bangla");
        l2.add("amar");
        System.out.println("LinkedList: " + l2);
        
        //List l3 = new Vector(3, 2);
        Vector l3 = new Vector(3, 2);
        l3.add("amar");
        l3.add("sonar");
        l3.add("bangla");
        l3.add("amar");
        System.out.println("Vector: " + l3 + " capacity: " + l3.capacity() + "\n");
        
        //Set l4 = new HashSet();
        HashSet l4 = new HashSet();  //duplicate value not allowed here
        l4.add("amar");
        l4.add("sonar");
        l4.add("amar");
        l4.add("bangla");
        System.out.println("HashSet: " + l4);
        
        //Set l5 = new LinkedHashSet();
        //HashSet l5 = new LinkedHashSet();
        LinkedHashSet l5 = new LinkedHashSet(); //duplicate value not allowed here
        l5.add("amar");
        l5.add("sonar");
        l5.add("bangla");
        l5.add("amar");
        System.out.println("LinkedHashSet: " + l5);
        
        //Set l6 = new TreeSet();
        //SortedSet l6 = new TreeSet(); 
        TreeSet l6 = new TreeSet(); //TreeSet provides sorted value
        l6.add("amar");
        l6.add("sonar");
        l6.add("bangla");
        l6.add("amar");
        System.out.println("TreeSet: " + l6 + "\n");
        
        //Map l7 = new HashMap();
        HashMap l7 = new HashMap(); //its paired between key and value
        l7.put("map1","amar");
        l7.put(102,"sonar");
        l7.put("map2","bangla");
        l7.put(104,"amar");
        System.out.println("HashMap: " + l7.entrySet());
        //System.out.println("HashMap: " + l7.keySet());
        //System.out.println("HashMap: " + l7.values());
       
        //Map l8 = new LinkedHashMap();
        //HashMap l8 = new LinkedHashMap(); 
        LinkedHashMap l8 = new LinkedHashMap(); //its paired between key and value
        l8.put("map1","amar");
        l8.put(102,"sonar");
        l8.put("map2","bangla");
        l8.put(104,"amar");
        System.out.println("LinkedHashMap: " + l8.entrySet());
        //System.out.println("LinkedHashMap: " + l8.keySet());
        //System.out.println("LinkedHashMap: " + l8.values());
        
        //Map l9 = new TreeMap();
        //SortedMap l9 = new TreeMap();
        TreeMap l9 = new TreeMap(); //provides  by default sorted
        l9.put("map3","amar");
        l9.put("map2","sonar");
        l9.put("map4","bangla");
        l9.put("map1","amar");
        //l8.put(101,"sonar");
        System.out.println("TreeMap: " + l9.entrySet());
        //System.out.println("TreeMap: " + l9.keySet());
        //System.out.println("TreeMap: " + l9.values());
        
        
        //Map l10 = new Hashtable();
        Hashtable l10 = new Hashtable();
        l10.put(10, "amar");
        l10.put("map", "sonar");
        l10.put(12, "bangla");
        System.out.println("Hashtable: " + l10.entrySet() + "\n");
        //System.out.println("Hashtable: " + l10.keySet());
        //System.out.println("Hashtable: " + l10.values());
        
        Queue l11 = new LinkedList();
        l11.add("amar");
        l11.add("sonar");
        l11.add("bangla");
        l11.add(121);
        System.out.println("Queue LinkedList: " + l11);
        
        
    }
}

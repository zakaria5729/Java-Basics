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

public class CollectionExample1 {

    public static void main(String[] args) {

        System.out.print("ArrayList: ");
        //List l1 = new ArrayList();
        ArrayList l1 = new ArrayList();
        l1.add("amar");
        l1.add("sonar");
        l1.add("bangla");
        l1.add("amar");
        print(l1);

        System.out.print("LinkedList: ");
        //List l2 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l2.add("amar");
        l2.add("sonar");
        l2.add("bangla");
        l2.add("amar");
        print(l2);

        System.out.print("Vector: ");
        //List l3 = new Vector(3, 2);
        Vector l3 = new Vector(3, 2);
        l3.add("amar");
        l3.add("sonar");
        l3.add("bangla");
        l3.add("amar");
        print(l3);
        System.out.print("(vector capacity: " + l3.capacity() + ")");
        System.out.println("\n");

        System.out.print("HashSet: ");
        //Set l4 = new HashSet();
        HashSet l4 = new HashSet();  //duplicate value not allowed here
        l4.add("amar");
        l4.add("sonar");
        l4.add("bangla");
        l4.add("amar");
        print(l4);

        System.out.print("LinkedHashSet: ");
        //Set l5 = new LinkedHashSet();
        //HashSet l5 = new LinkedHashSet();
        LinkedHashSet l5 = new LinkedHashSet(); //duplicate value not allowed here
        l5.add("amar");
        l5.add("sonar");
        l5.add("bangla");
        l5.add("amar");
        print(l5);

        System.out.print("TreeSet: ");
        //Set l6 = new TreeSet();
        //SortedSet l6 = new TreeSet(); 
        TreeSet l6 = new TreeSet(); //TreeSet provides sorted value
        l6.add("amar");
        l6.add("sonar");
        l6.add("bangla");
        l6.add("amar");
        print(l6);
        System.out.println();

        System.out.print("HashMap: ");
        //Map l7 = new HashMap();
        HashMap l7 = new HashMap(); //its paired between key and value
        l7.put("map1", "amar");    //and cannot contains duplicate keys but contains in duplicate values
        l7.put("map2", "sonar");
        l7.put("map3", "bangla");
        l7.put("map1", "tomar");
        print(l7.keySet());
        print(l7.values());
        System.out.println();

        System.out.print("LinkedHashMap: ");
        //Map l8 = new LinkedHashMap();
        //HashMap l8 = new LinkedHashMap(); 
        LinkedHashMap l8 = new LinkedHashMap(); //its paired between key and value
        l8.put("map1", "amar");
        l8.put("map2", "sonar");
        l8.put("map3", "bangla");
        l8.put("map4", "amar");
        print(l8.keySet());
        print(l8.values());
        //print(l8.entrySet());
        System.out.println();

        System.out.print("TreeMap: ");
        //Map l9 = new TreeMap();
        //SortedMap l9 = new TreeMap();
        TreeMap l9 = new TreeMap(); //provides  by default sorted
        l9.put("map3", "amar");
        l9.put("map2", "sonar");
        l9.put("map4", "bangla");
        l9.put("map1", "amar");
        //l8.put(101,"sonar");
        //print(l9.entrySet());
        print(l9.keySet());
        print(l9.values());
        System.out.println();

        System.out.print("Hashtable: ");
        //Map l10 = new Hashtable();
        Hashtable l10 = new Hashtable();
        l10.put("map2", "sonar");
        l10.put("map1", "amar");
        l10.put("map3", "bangla");
        //print(l10.entrySet());
        print(l10.keySet());
        print(l10.values());
        System.out.println();

        
        System.out.print("Queue: ");
        Queue l11 = new LinkedList();
        l11.add("amar");
        l11.add("sonar");
        l11.add("bangla");
        l11.add("amar");
        print(l11);
    }
    
    static void print(Collection coll) {
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            String el = (String) it.next();
            System.out.print(el + " ");
        }
        System.out.println();
    }
}

        /* Uses of Collections frameworks */

// ArrayList = for faster iteration and faster random access and no need to add or delete. ordered but not sorted
// LinkedList = for add or remove elements frequently
// Vector = synchronized for thread safety
//
// Set (interface) = doesn't allow duplicate elements
// HashSet = unsorted and un-ordered
// LinkedHashSet = unsorted and ordered
// TreeSet = sorted
//
// Map (interface) = paired of keys and values and key unique but values unique or not
// HashMap = unsorted and un-ordered and allow one null key and multiple null values
// LinkedHashMap = suitable for frequent add or remove
// TreeMap = sorted map
// Hashtable = synchronized for thread safety and doesn't allows null keys or null values
//
// Collection = its contains all the collection types values 
//
// List, Set, Queue = add method
// Map = put method
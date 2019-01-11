package java_again;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        List aList = new ArrayList();
        aList.add("ArrayList: Zakaria");
        aList.add("Saharia");
        aList.add("Abdullah");
        aList.add("Hasib");
        aList.add("Saharia");
        System.out.println(aList);
        
        List bList = new LinkedList();
        bList.add("LinkedList: Zakaria");
        bList.add("Saharia");
        bList.add("Abdullah");
        bList.add("Hasib");
        bList.add("Saharia");
        System.out.println(bList);
        
        List vList = new Vector();
        vList.add("Vector: Zakaria");
        vList.add("Saharia");
        vList.add("Abdullah");
        vList.add("Hasib");
        vList.add("Saharia");
        System.out.println(vList);
        
        Set aSet = new HashSet();
        aSet.add("HashSet: Zakaria");
        aSet.add("Saharia");
        aSet.add("Abdullah");
        aSet.add("Hasib");
        aSet.add("Saharia");
        System.out.println(aSet);
        
        Set lSet = new LinkedHashSet();
        lSet.add("LinkedHashSet: Zakaria");
        lSet.add("Saharia");
        lSet.add("Abdullah");
        lSet.add("Hasib");
        lSet.add("Saharia");
        System.out.println(lSet);
        
        Set tSet = new TreeSet();
        tSet.add("TreeSet: Zakaria");
        tSet.add("Saharia");
        tSet.add("Abdullah");
        tSet.add("Hasib");
        tSet.add("Saharia");
        System.out.println(tSet);
        
        SortedSet sSet = new TreeSet();
        sSet.add("Sorted: Zakaria");
        sSet.add("Saharia");
        sSet.add("Abdullah");
        sSet.add("Hasib");
        sSet.add("Saharia");
        System.out.println(sSet);
        
        Map hMap = new HashMap();
        hMap.put("z", "HashMap: Zakaria");
        hMap.put("s", "Saharia");
        hMap.put("a", "Abdullah");
        hMap.put("s", "Saharia");
        System.out.println(hMap);
        
        Map lMap = new LinkedHashMap();
        lMap.put("z", "LinkedHashMap: Zakaria");
        lMap.put("s", "Saharia");
        lMap.put("a", "Abdullah");
        lMap.put("s", "Saharia");
        System.out.println(lMap);
        
        Map tMap = new TreeMap();
        tMap.put("z", "TreeMap: Zakaria");
        tMap.put("s", "Saharia");
        tMap.put("a", "Abdullah");
        tMap.put("z", "Zakaria");
        System.out.println(tMap);
        
         Hashtable<String,String> hTable = new Hashtable<String,String>();  
         hTable.put("z", "HashTable: Zakaria");
         hTable.put("s", "Saharia");
         hTable.put("a", "Abdullah");
         hTable.put("s", "Saharia");
         System.out.println(hTable);
    }
}
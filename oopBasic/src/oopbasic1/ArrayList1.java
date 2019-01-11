package oopbasic1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>(3);
        System.out.println("array list size = " + num.size());
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        
        for (int i = 0; i < 3; i++) {
            int res = input.nextInt();
            //num.add(i, res); //using index number\
            num.add(res); //using default index number
        }
        System.out.println();
        
        //print using for each loop
        for (Integer s : num) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        //print using iterator
        Iterator it = num.iterator(); //method name must be small letter
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        
        System.out.println("Indexof: "+ num.indexOf(2));
        
        num.set(2, 40); //already exist k replace
        System.out.println("after set: " + num);
        
        System.out.println("get: "+ num.get(2));
        
        num.remove(1);
        System.out.println("remove from 1 index element: " +num);     //index start from 0
        
        boolean con = num.contains(1);
        System.out.println("1 is contain or not: "+con);
        
        num.removeAll(num);
        System.out.println("remove all"+num);
        
        num.clear();
        System.out.println("clear all"+num);
        
        boolean b = num.isEmpty();
        System.out.println("empty check: "+b);
        
        String s = Integer.toString(56);
        System.out.println("string: "+s+" length: "+s.length());
        System.out.println(s instanceof String);
        
    }
}

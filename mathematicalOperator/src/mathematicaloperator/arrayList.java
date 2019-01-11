package mathematicaloperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = input.nextInt();

        System.out.println("\nEnter array elements: ");
        for (int i = 0; i < n; i++) {
            num.add(input.nextInt());
        }
        System.out.println();

        /*for each loop*/
        for (Integer integer : num) {
            System.out.println(integer + " ");
        }
        System.out.println();

        /*iterator loop*/
        Iterator itr = num.iterator();
        while (itr.hasNext()) {
            System.out.println("" + itr.next());
        }
        System.out.println();

        /*isempty*/
        boolean b = num.isEmpty();
        if (b) {
            System.out.println("is empty: " + b);
        } 
        else {
            System.out.println("is empty: " + b);
        }

        /*contains*/
        boolean con = num.contains(30);
        if (con) {
            System.out.println("30 is contain: " + con);
        } 
        else {
            System.out.println("30 is contain: " + con);
        }
        
        /*indexOf method*/
         int x = num.indexOf(30);
         System.out.println("index 30 is: " + x);
        
        /*set method*/
        num.set(3, 90);
        System.out.println(num);
        
        /*get method*/
        int y = num.get(2);
        System.out.println("index 2 is: " + y);
        
        /*addd all method*/
        num1.addAll(num);
        System.out.println(num1);
        
        /*equals*/
        boolean eq = num1.equals(num);
        System.out.println("equals: " + eq);
        
        /*sort reverse sort*/
        Collections.sort(num1);
        System.out.println("ascending order: " + num1);
        
        Collections.sort(num1, Collections.reverseOrder());
        System.out.println("descending order: " + num1);
        
        /*remove method*/
        num.remove(2);
        System.out.println(num);

        /*remove all method*/
        num.removeAll(num);
        System.out.println(num);
         
        /*clear method*/
        num.clear();
        System.out.println("clear: " + num);
      
    }
}

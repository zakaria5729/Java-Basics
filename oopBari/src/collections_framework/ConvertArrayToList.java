package collections_framework;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {
        
        String sArray[] = new String[550000];
        for (int i=0; i <550000; i++) {
            sArray[i] = "array" + i;
        }
        
        List list = Arrays.asList(sArray); //convert array to list
        
        System.out.println("-----Iterator loop----");
        long iteratorStarTime = new Date().getTime();
        System.out.println("Start: " + iteratorStarTime);
        
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
        }
        
        long iteratorEndTime = new Date().getTime();
        System.out.println("End: " + iteratorEndTime);
        
        long iteratorDifference = iteratorEndTime - iteratorStarTime;
        System.out.println("Iterator time : " + iteratorDifference);
        
        
        
        System.out.println("\n-----for loop----");
        long forStarTime = new Date().getTime();
        System.out.println("Start: " + forStarTime);
        
        for (int i = 0; i < list.size(); i++) {
            String stemp = (String) list.get(i);
        }
        
        long forEndTime = new Date().getTime();
        System.out.println("End: " + forEndTime);
        
        long forDifference = forEndTime - forStarTime;
        System.out.println("for time : " + forDifference);
        
        
        
        System.out.println("\n-----while loop----");
        long whileStarTime = new Date().getTime();
        System.out.println("Start: " + whileStarTime);
        
        int j = 0;
        while (list.size() > j) {
            String wtemp = (String) list.get(j);
            j++;
        }
        
        long whileEndTime = new Date().getTime();
        System.out.println("End: " + whileEndTime);
        
        long whileDifference = whileEndTime - whileStarTime;
        System.out.println("while time : " + whileDifference);
       
    }
}

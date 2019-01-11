/**
*instance/non static variable related to object 
*static variable related to class
*final = a constant variable and value
*/
package oopbasic1;

public class InstanceCounter {
    
    static {
        System.out.println("class instanceCounter loading...");
    }
    
    static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 3600;
    static int instanceCounter;
    //int instanceCounter;
    
    static {
        System.out.println("ONE_DAY_IN_MILLIS = " + ONE_DAY_IN_MILLIS + " instanceCounter = " + instanceCounter);
    }
    
//    static {
//        System.out.println("ONE_DAY_IN_MILLIS = " + ONE_DAY_IN_MILLIS + " instanceCounter = " + new InstanceCounter().instanceCounter);
//    }
    
    /*only blog*/
    {
        instanceCounter++;
        System.out.println("instanceCounter = " + instanceCounter);
    }
    
    public static void main(String[] args) {
        System.out.println("starting instanceCounter");
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        
        System.out.println("Instance in main = " +instanceCounter);
        //System.out.println("Instance in main = " +new InstanceCounter().instanceCounter);
    }
    
    static {
        System.out.println("Class instance loadded");
    }
}

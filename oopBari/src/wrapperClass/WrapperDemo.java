package wrapperClass;

public class WrapperDemo {

    public static void main(String[] args) {
        Integer intObj1 = new Integer(25);  //here as like the constructor overloading
        Integer intObj2 = new Integer("25");
        Integer intObj3 = 35;

        //compareTo demo
        System.out.println("comparing using compareTo obj1 and obj2: " + intObj1.compareTo(intObj2));   //if two obj are same then return 0, obj1<obj2 = -1, obj1>obj2 = 1
        System.out.println("comparing using compareTo obj1 and obj3: " + intObj1.compareTo(intObj3));
        System.out.println("comparing using compareTo obj1 and obj3: " + Integer.compare(intObj3, intObj1));

        //equals demo
        System.out.println("comparing using equals obj1 and obj2: " + intObj1.equals(intObj2));
        System.out.println("comparing using equals obj1 and obj3: " + intObj1.equals(intObj3));

        Float f1 = new Float("2.25f");
        Float f2 = new Float(2.25f);

        Float f = (float) intObj1 + intObj2;
        Float ff = intObj1.floatValue() + f1;
        System.out.println("addition of intObj1 and f1: " + f);
        System.out.println("addition of intObj1 and f1: " + ff);
        
        //valueOf method
        Integer intW = Integer.valueOf("3");
        //or we can write 
        Integer intWW = Integer.valueOf("323", 10);
        Integer intW1 = Integer.valueOf("0111", 2);
        Integer intW2 = Integer.valueOf("D", 16);
        Integer intW3 = Integer.valueOf("23", 8);
        
        System.out.println(intW);
        System.out.println(intWW);
        System.out.println(intW1);
        System.out.println(intW2);
        System.out.println(intW3);
        
        System.out.println("binary value of intWrapper: " + Integer.toBinaryString(intW));
    }
}

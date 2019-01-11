package wildcard;

import java.util.ArrayList;

public class GenericsNotCoverient {

    public static void main(String[] args) {
        
        Integer[] intArray = new Integer[10];
        Number[] numberArray = intArray;  /*this is ok cz Number calss is a parent class of Integer*/
        
        ArrayList<Integer> inList = new ArrayList();
        //ArrayList<Number> numList = inList;
        
        /*a type of generics won't assigned to other type of generics that's why generics not coverinet but a list or array can do that*/
    }
}

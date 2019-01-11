package typeCasting;

public class PrimitiveTypeCasting {
    
    public static void main(String[] args) {
        
        /*string to int*/ 
        String s = "13";
        int stoi = Integer.parseInt(s);
        //or we can write
        stoi = Integer.valueOf(s).intValue();
        System.out.println("stoi = " + stoi);
        
        /*int to string*/ 
        int i = 14;
        String itos = Integer.toString(i);
        System.out.println("itos = " + itos);
        
        /*string to double*/
        String s2 = "32";
        double stod = Double.parseDouble(s2);
        //or we can write
        stod = Double.valueOf(s2).doubleValue();
        System.out.println("stod = " + stod);
        
        /*double to string*/
        double d = 13.5d;
        String dtos = Double.toString(d);
        
        /*string to long*/
        String s3 = "43";
        long stol = Long.valueOf(s3).longValue();
        //or we can write
        stol = Long.parseLong(s3);
        System.out.println("stol = " + stol);
        
        /*long to string*/
        long lg = 4344;
        String ltos = Long.toString(lg);
        System.out.println("ltos = " + ltos);
        
        /*char to int*/
        char c = 'a';
        int ctoi = c; //no need to explicit cast because int > char
        System.out.println("ctoi = " + ctoi);
        
        /*int to char*/
        int i1 = 53;
        char itoc = (char) i1;
        System.out.println("itoc = " + itoc);
        
        /*int to float (widening cast)*/
        int i2 = 21;
        float itof = i2;
        System.out.println("itof = " + itof);
        
        /*float to int (narrowing cast)*/
        float f = 21.23f;
        int ftoi = (int) f;
        System.out.println("ftoi = " + ftoi);
        
        /*string to char*/
        String s4 = "hello";
        char stoc = (char) s4.charAt(0);
        //we can convert all stoc using a loop
        for (int j = 0; j < s4.length(); j++) {
           char stoc1 = (char) s4.charAt(j);
            System.out.println("stoc = " + stoc1);
        } 
    }
}

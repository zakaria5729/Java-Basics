package labworkd;

public class Splite {

    public static void main(String[] args) {

        String st[] = {"int", "a", "b", "c", ";", ","};
        String ss[] = null;
        
        String s = "; , a , b , c";
        String[] s2;
        s2 = s.split("\\s");
        
        int j = 0;
        for (String a : st) {
            for (String b : s2) {
                if(a.equals(b)) {
                    ss[j++] = b;
                }
                System.out.println(ss[0]);
            }
        }
    }
}

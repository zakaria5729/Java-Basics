package mathematicaloperator;

public class stringDemon3 {
    public static void main(String[] args) {
        String st = "amar sonar bangla";
        String[] sp = st.split(" ");
        
        for (String string : sp) {
            System.out.println(string);
        }
        
        String rep = st.replace("a", "z");
        System.out.println(rep);
    }
}

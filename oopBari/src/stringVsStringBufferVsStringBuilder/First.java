package stringVsStringBufferVsStringBuilder;

public class First {

    public static void main(String[] args) {
        String s = "Dhaka";
        s.concat(" Bangladesh");
        //s = s.concat(" Bangladesh");
        System.out.println(s);
     
        StringBuffer sb = new StringBuffer("Dhaka");
        sb.append(" Bangladesh");
        System.out.println(sb);
    }
}

package hackkerrank;

import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer tk = new StringTokenizer(s, ",//!//.// //'//?//_//@");
        String str = null;
        int count = 0;

        ArrayList<String> al = new ArrayList<String>();

        while (tk.hasMoreTokens()) {
            al.add(tk.nextToken());
            count++;
        }

        System.out.println(count);
        for (String a : al) {
            System.out.println(a);
        }
        scan.close();
    }
}

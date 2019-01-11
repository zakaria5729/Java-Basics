/**
* 1. If our text is not going to change then use a String because this String object is immutable
* 2. If out text can be changed and use only a single thread then use string buffer
* 3. If our text can be changed and use multiple thread then use string builder
*/

package stringVsStringBufferVsStringBuilder;

public class Concat {

    public static String concatWithString() {
        String t = "cat";
        for (int i = 0; i < 10000; i++) {
            t = t.concat(" dog");
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("cat");
        for (int i = 0; i < 10000; i++) {
            sb.append(" dog");
        }
        return sb.toString();
    }

    public static String concatWithStringBuilder() {
        StringBuilder sb = new StringBuilder("cat");
        for (int i = 0; i < 10000; i++) {
            sb.append(" dog");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("string concat took = " + (System.currentTimeMillis()- start) + "ms");

        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("string buffer append took = " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("string builder append took = " + (System.currentTimeMillis() - start) + "ms");
    }
}

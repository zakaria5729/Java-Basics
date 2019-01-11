package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList();
        ArrayList<String> aList2 = new ArrayList();
        ArrayList<String> aList3 = new ArrayList();

        aList.add("amar");
        aList.add("sonar");
        aList.add("bangla");
        aList.add("tomay");
        aList.add("valobashi");

        aList2.add("ami");
        aList2.add("tumi");
        aList2.add("bangla");
        aList2.add("tomay");

//        System.out.println();
//        for (int i = 0; i < aList2.size(); i++) {
//            for (int j = 0; j < aList.size(); j++) {
//                if (aList2.get(i).equals(aList.get(j))) {
//                    aList3.add(aList.get(i));
//                }
//            }
//        }
        System.out.println();
        for (String s2 : aList2) {
            for (String s : aList) {
                if (s2.equals(s)) {
                    aList3.add(s2);
                }
            }
        }

//        System.out.println();
//        int i = 0, j = 0;
//        while (aList2.size() > i) {
//            while (aList.size() > j) {
//                if(aList2.get(i).equals(aList.get(j))) {
//                    aList3.add(aList2.get(i));
//                }
//                j++;
//            }
//            i++;
//        }
//        Iterator<String> it = aList.iterator();
//        Iterator<String> it2 = aList2.iterator();
//
//        while (it2.hasNext()) {
//            while (it.hasNext()) {
//                if (it2.equals(it.next())) {
//                    aList3.add(it2.next());
//                }
//            }
//        }

        for (String s : aList3) {
            System.out.println(s);
        }
    }
}

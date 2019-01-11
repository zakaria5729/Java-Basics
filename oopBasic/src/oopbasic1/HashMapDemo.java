package oopbasic1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        //HashMap always detect with id (name) and HashMap and this class name can't be same
        HashMap<Integer, String> hash = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your HashMap size: ");
        int n = input.nextInt();

        //can't use add method. use put, get method
        for (int i = 0; i < n; i++) {
            int id = input.nextInt();
            String name = input.nextLine();

            hash.put(id, name);
        }

        System.out.println("Enter a id: ");
        int iid = input.nextInt();
        System.out.println(hash.get(iid));
    }
}

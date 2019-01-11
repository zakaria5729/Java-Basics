package circle.area;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int radius;
        float res;
        System.out.println("Enter a number of radius");
        radius = scn.nextInt();
        
        res = (float) radius * radius * 3.1416f;
        
        System.out.println("circle Area = " + res);
    }
}

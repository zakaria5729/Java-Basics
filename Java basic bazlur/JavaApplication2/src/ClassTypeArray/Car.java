package ClassTypeArray;

public class Car {
    public static void main(String[] args) {
        System.out.println("Hello\n");
        
        AutoMobile[] autoMobiles = new AutoMobile[4];
        
        for (int i = 0; i < autoMobiles.length; i++) {
            autoMobiles[i] = new AutoMobile(i+1);
        }
    }
}

class AutoMobile {
    private int door;

    public AutoMobile(int door) {
        this.door = door;
         System.out.println("automobile constructor called..door is.. "+door);
    }
}

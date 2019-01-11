package SingleTon;

public class SingleClassDemo {

    public static void main(String[] args) {
        //SingleClass ob = new SingleClass(); //can not create obj cz its constructor is private
        
        SingleClass ob = SingleClass.getInstanceOfObject();
        ob.display();
        
    }
}
